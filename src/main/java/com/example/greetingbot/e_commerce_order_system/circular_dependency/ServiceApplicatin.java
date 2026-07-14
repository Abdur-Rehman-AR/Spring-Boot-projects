package com.example.greetingbot.e_commerce_order_system.circular_dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ServiceApplicatin {
    public static void main(String[] args) {
        
        ApplicationContext context = SpringApplication.run(main.class, args);

        // showing circular dependency
        ServiceA serviceA = context.getBean(ServiceA.class);
        ServiceB serviceB = context.getBean(ServiceB.class);


    }
}