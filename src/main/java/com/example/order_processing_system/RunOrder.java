package com.example.order_processing_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RunOrder {

    public static void main(String[] args) {

        // it creates ioc container and reference goes to ioc_container varaiable.

        ApplicationContext ioc_Container = SpringApplication.run(RunOrder.class, args);

        OrderService obj = ioc_Container.getBean(OrderService.class);

        Order order = new Order("Pen", 50);
        obj.orderService(order);

        Order order1 = new Order("pencil", 150);
        obj.orderService(order1);

    }
}