package com.example.app_configuration_lifecycle_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class Main {
    public static void main(String[] args) {
        
        // ConfigurableApplicationContext is an advanced version of ApplicationContext 
        // that provides extra control over the Spring container lifecycle, such as closing, 
        // refreshing, and managing the context programmatically.

        ConfigurableApplicationContext context = SpringApplication.run(AppConfiguration.class, args);
        AppSettings obj = context.getBean(AppSettings.class);
        obj.dispaly();

        // This will trigger the @PreDestroy method in AppSettings to run and 
        // perform cleanup tasks before the application shuts down.
        context.close(); 
    }
}