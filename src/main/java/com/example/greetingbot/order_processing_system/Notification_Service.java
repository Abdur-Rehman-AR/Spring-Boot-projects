package com.example.greetingbot.order_processing_system;

import org.springframework.stereotype.Service;

@Service
public class Notification_Service {

    public void sendAlert(Order order) {
        System.out.println("Alert: Order for item " + order.getItemName() + " has bee processed.");
    }
}