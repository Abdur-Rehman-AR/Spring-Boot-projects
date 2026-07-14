package com.example.order_processing_system;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final Notification_Service ns;

    public OrderService(Notification_Service ns) {
        this.ns = ns;
    }

    /*
     * We are using the concept of Externalized Configuration. We keep configuration
     * numbers and strings in a separate text file so they can be changed instantly 
     * without touching a single line of Java code.
     */
    @Value("${order.expensive.threshold}")
    private int limit;

    public void orderService(Order order) {
        if (order.getPrice() >= limit) {
            System.out.println("Processing Expensive order.");
            ns.sendAlert(order);
        } else {
            System.out.println("Processing Cheap order.");
        }
    }
}