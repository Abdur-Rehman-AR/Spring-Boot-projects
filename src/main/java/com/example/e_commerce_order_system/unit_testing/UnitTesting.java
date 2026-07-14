package com.example.e_commerce_order_system.unit_testing;

import com.example.e_commerce_order_system.constructor_injection.ModernOrderProcessor;

public class UnitTesting {
    public static void main(String[] args) {


        FakePayment fakePayment = new FakePayment();

        // When you instantiate a class manually using the new keyword in plain Java 
        // Java will completely ignores the @Qualifier annotation.
        ModernOrderProcessor modernOrderProcessor = new ModernOrderProcessor(fakePayment);
        modernOrderProcessor.processOrder();
    }
}