
package com.gp;

import java.util.concurrent.atomic.AtomicInteger;

public class RequestScopedService implements Service {
    
    public static AtomicInteger serviceIdCounter = new AtomicInteger();
    
    private final int id;
    private final Request request;
    private final String threadName;
    
    public RequestScopedService(Request request) {
        this.id = serviceIdCounter.incrementAndGet();
        this.request = request;
        this.threadName = Thread.currentThread().getName();
    }

    @Override
    public String getMessage() {
        return "Hello " + request.getFrom();
    } 

    @Override
    public int serviceId() {
        return id;
    }  
    
    @Override
    public String getThreadName() {
        return threadName;
    }
}
