package com.example.e_commerce_order_system.tight_coupling;

public class RunApplication {
    public static void main(String[] args) {

        OldOrderProcessor p = new OldOrderProcessor();
        p.processOrder();

    }
}