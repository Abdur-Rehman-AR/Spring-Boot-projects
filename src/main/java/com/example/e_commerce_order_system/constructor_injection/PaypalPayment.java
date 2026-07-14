package com.example.e_commerce_order_system.constructor_injection;

import org.springframework.stereotype.Component;

// Spring will manage this class as well
@Component
public class PaypalPayment implements PaymentGateway {

    @Override
    public void processPayment() {
        System.out.println("Payment is done using Paypal.");
    }

}