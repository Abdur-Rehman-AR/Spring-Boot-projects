package com.example.e_commerce_order_system.circular_dependency;

import org.springframework.stereotype.Component;

@Component
public class ServiceB{

    @SuppressWarnings("unused")
    final private ServiceA serviceA;

    public ServiceB(ServiceA serviceA)
    {
        this.serviceA = serviceA;
    }
}