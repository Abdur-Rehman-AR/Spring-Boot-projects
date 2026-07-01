package com.example.greetingbot.order_processing_system;

public class Order {

    private String itemName;
    private double price;

    public Order(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
}