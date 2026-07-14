package com.example.greetingbot.e_commerce_order_system.constructor_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RunApplication {

    public static void main(String[] args) {

        // starts the Springboot application
        ApplicationContext context = SpringApplication.run(RunApplication.class, args);

        // gives the object of ModernOrderProcessor class and calls the function
        ModernOrderProcessor modernOrderProcessor = context.getBean(ModernOrderProcessor.class);
        modernOrderProcessor.processOrder();
    }
}