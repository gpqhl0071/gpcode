
package com.gp;

public class Request {
    
    private final String from;
    private final boolean shutdownTrigger;
    
    public Request(String from) {
        this.from = from;
        shutdownTrigger = false;
    }
    
    Request() {
        shutdownTrigger = true;
        from = null;
    }
    
    public String getFrom() {
        return from;
    }
    
    boolean isShutdownTrigger() {
        return shutdownTrigger;
    }
}
