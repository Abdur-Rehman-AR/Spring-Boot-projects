package com.example.greetingbot.e_commerce_order_system.circular_dependency;

import org.springframework.stereotype.Component;

@Component
public class ServiceA{

    final private ServiceB serviceB;

    public ServiceA(ServiceB serviceB)
    {
        this.serviceB = serviceB;
    }
    
}