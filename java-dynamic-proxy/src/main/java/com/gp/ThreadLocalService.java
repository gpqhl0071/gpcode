
package com.gp;

public class ThreadLocalService {
    
    private static final ThreadLocal<Service> services = new ThreadLocal<>();
    
    public static void set(Service service) {
        services.set(service);
    }
    
    public static Service get() {
        return services.get();
    }
    
    public static void remove() {
        services.remove();
    }
}
