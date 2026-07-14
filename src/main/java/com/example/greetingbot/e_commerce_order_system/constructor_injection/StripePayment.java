package com.example.greetingbot.e_commerce_order_system.constructor_injection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Spring will manage this class as a bean
@Component
// This tells spring to always use this class as a 1st choice (if there are
// multiple
// classes) to create the object.
@Primary
public class StripePayment implements PaymentGateway {

    @Override
    public void processPayment() {
        System.out.println("Payment is done using Stripe.");
    }
}