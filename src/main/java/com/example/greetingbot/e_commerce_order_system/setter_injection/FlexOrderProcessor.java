package com.example.greetingbot.e_commerce_order_system.setter_injection;

import org.springframework.stereotype.Component;

@Component
public class FlexOrderProcessor {

    private Manager manager;

    // setter-DI ensures that the dependency is mutable.
    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void check(String name) {
        manager.isStockPresent(name);
    }

}