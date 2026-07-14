package com.example.e_commerce_order_system.setter_injection;

import org.springframework.stereotype.Component;

@Component
public class InventoryManager implements Manager {

    @Override
    public void isStockPresent(String name) {
        System.out.println(name + ": Stock Present.");
    }
}