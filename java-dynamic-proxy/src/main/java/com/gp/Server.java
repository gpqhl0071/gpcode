package com.gp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Server {

    private static final int QUEUE_SIZE = 10;
    public static final int POOL_SIZE = QUEUE_SIZE * 2;

    private final BlockingQueue<Request> requests = new ArrayBlockingQueue<>(QUEUE_SIZE);
    private final ExecutorService executors = Executors.newFixedThreadPool(POOL_SIZE);
    private final SingletonService singletonService;

    private final Class<? extends RequestHandler> userDefineHandler;

    public Server(Class<? extends RequestHandler> userHandlerClass) {
        this.userDefineHandler = userHandlerClass;
        validateHandlerClass(userHandlerClass);
        this.singletonService = initSingletonService();

    }

    private static SingletonService initSingletonService() {
        Service proxyService = (Service) Proxy.newProxyInstance(
                Service.class.getClassLoader(), new Class[]{Service.class},
                new ServiceInvocationHandler());
        return new SingletonService(proxyService);
    }

    private static void validateHandlerClass(Class<? extends RequestHandler> handlerCls) {
        boolean hasFieldInjection = false;
        for (Field field : handlerCls.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)
                    && field.getType() == SingletonService.class) {
                if (!hasDefaultConstructor(handlerCls)) {
                    throw new RuntimeException("Field injection requires a default constructor.");
                } else {
                    hasFieldInjection = true;
                    break;
                }
            }
        }
        if (!hasFieldInjection) {
            Constructor[] cons = handlerCls.getConstructors();
            for (Constructor con : cons) {
                if (con.isAnnotationPresent(Inject.class)
                        && !(con.getParameterCount() == 1)
                        && con.getParameterTypes()[0] != SingletonService.class) {
                    throw new RuntimeException("Constructor injection requires a "
                            + "constructor that accepts a SingletonService as the only argument");
                }
            }
        }
    }

    private static boolean hasDefaultConstructor(Class<?> handlerCls) {
        Constructor[] cons = handlerCls.getConstructors();
        for (Constructor con : cons) {
            if (con.getParameterCount() == 0) {
                return true;
            }
        }
        return false;
    }

    public void sendRequest(Request request) {
        try {
            requests.put(request);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void startServer() {
        executors.submit(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Request request = requests.take();
                        if (request.isShutdownTrigger()) {
                            break;
                        }
                        executors.submit(new RequestProcessor(userDefineHandler,
                                                              singletonService,
                                                              request));
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                System.out.println("Server shutdown!");
            }
        });  
    }

    public void shutDown() {
        try {
            requests.put(new Request());
            executors.shutdown();
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void setAwaitTermination(int time, TimeUnit timeUnit) {
        try {
            executors.awaitTermination(time, timeUnit);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
