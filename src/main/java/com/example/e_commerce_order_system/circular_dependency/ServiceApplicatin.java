package com.example.e_commerce_order_system.circular_dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ServiceApplicatin {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        ApplicationContext context = SpringApplication.run(ServiceApplicatin.class, args);

        // showing circular dependency
        ServiceA serviceA = context.getBean(ServiceA.class);
        ServiceB serviceB = context.getBean(ServiceB.class);


    }
}