package com.example.e_commerce_order_system.setter_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SetterInjectionApplication {
    public static void main(String[] args) {
        
        // Starting the Application
        ApplicationContext context = SpringApplication.run(SetterInjectionApplication.class, args);

        // creating bean of FlexOrderProcessor to show mutable dependency 
        FlexOrderProcessor flexOrderProcessor = context.getBean(FlexOrderProcessor.class);

        // giving 2 different objects to FlexOrderProcessor constructor
        InventoryManager inventoryManager = context.getBean(InventoryManager.class);
        flexOrderProcessor.setManager(inventoryManager);
        flexOrderProcessor.check("Inventory Manager");

        DigitalManager digitalManager = context.getBean(DigitalManager.class);
        flexOrderProcessor.setManager(digitalManager);
        flexOrderProcessor.check("Digital Manager");
    }
}