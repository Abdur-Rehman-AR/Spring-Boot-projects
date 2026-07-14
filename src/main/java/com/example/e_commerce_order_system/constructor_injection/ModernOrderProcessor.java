package com.example.e_commerce_order_system.constructor_injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ModernOrderProcessor {

    final private PaymentGateway paymentGateway;

    // By default Spring automatically names components using camelCase based on the
    // class name.

    public ModernOrderProcessor(@Qualifier("paypalPayment") PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processOrder() {
        System.out.println("Processing Order in Modern System ... ");
        paymentGateway.processPayment();
    }
}