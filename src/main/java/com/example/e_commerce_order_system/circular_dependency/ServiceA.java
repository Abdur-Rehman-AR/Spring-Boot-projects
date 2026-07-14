package com.example.e_commerce_order_system.circular_dependency;

import org.springframework.stereotype.Component;

@Component
public class ServiceA{

    @SuppressWarnings("unused")
    final private ServiceB serviceB;

    public ServiceA(ServiceB serviceB)
    {
        this.serviceB = serviceB;
    }
    
}