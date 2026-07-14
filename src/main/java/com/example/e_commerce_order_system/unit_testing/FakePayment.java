package com.example.e_commerce_order_system.unit_testing;

import com.example.e_commerce_order_system.constructor_injection.PaymentGateway;

public class FakePayment implements PaymentGateway{

    @Override
    public void processPayment() {

        System.out.println("Fake payment is being processed.");
    }   
}