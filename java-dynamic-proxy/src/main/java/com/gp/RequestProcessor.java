package com.gp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class RequestProcessor implements Runnable {

    private final Class<? extends RequestHandler> handlerCls;
    private final SingletonService singletonService;
    private final Request request;

    public RequestProcessor(Class<? extends RequestHandler> requestHandlerCls,
            SingletonService singletonService,
            Request request) {
        this.handlerCls = requestHandlerCls;
        this.singletonService = singletonService;
        this.request = request;
    }

    @SuppressWarnings("UseSpecificCatch")
    RequestHandler initInjections() {
        try {
            for (Field field : handlerCls.getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)
                        && field.getType() == SingletonService.class) {
                    return createHandler(field, handlerCls);
                }
            }

            Constructor[] cons = handlerCls.getConstructors();
            for (Constructor con : cons) {
                if (con.isAnnotationPresent(Inject.class)
                        && con.getParameterCount() == 1
                        && con.getParameterTypes()[0] == SingletonService.class) {
                    return (RequestHandler) con.newInstance(singletonService);
                }
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        throw new RuntimeException("RequestHandler could not be created.");
    }

    private RequestHandler createHandler(Field f, Class handlerCls) throws Exception {
        if (!hasDefaultConstructor(handlerCls)) {
            throw new RuntimeException("Field injection  for RequestHandler "
                    + "must have default constructor.");
        }
        Constructor con = handlerCls.getConstructor();
        RequestHandler handler = (RequestHandler) con.newInstance();
        f.setAccessible(true);
        f.set(handler, singletonService);
        return handler;
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
    
    private void setThreadLocalService() {
        ThreadLocalService.set(new RequestScopedService(request));
    }

    @Override
    public void run() {
        // 将服务与线程绑定
        setThreadLocalService();
        // 初始化默认的执行类 DefaultRequestHandler
        RequestHandler handler = initInjections();
        // GO GO GO 看效果在这里
        Response response = handler.handleRequest(request);
        System.out.println(response.getMessage());
    }
}
