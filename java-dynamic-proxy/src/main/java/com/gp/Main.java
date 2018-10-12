package com.gp;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws Exception {

        final Server server = new Server(DefaultRequestHandler.class);
        server.startServer();

//        final String[] requestNames = {"Kobe", "Lebron", "Jordan", "Steph", "Pierce"};

        final String[] requestNames = {"Kobe"};

        for (String requestName : requestNames) {
            server.sendRequest(new Request(requestName));
            TimeUnit.MILLISECONDS.sleep(500);
        }

        TimeUnit.SECONDS.sleep(1500);
        server.setAwaitTermination(3, TimeUnit.SECONDS);
        server.shutDown();
    }
}
