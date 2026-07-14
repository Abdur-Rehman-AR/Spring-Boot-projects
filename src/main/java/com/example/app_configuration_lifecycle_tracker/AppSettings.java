package com.example.app_configuration_lifecycle_tracker;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class AppSettings {

    String appName;

    public AppSettings(String appName) {
        this.appName = appName;
    }

    public void dispaly() {
        System.out.println("App name: " + this.appName);
    }

    // This method will run after the object creation and dependency injection is
    // done.

    @PostConstruct
    public void init() {
        System.out.println("App Settings Initialized.");
    }

    // This method will run before the bean is finally destroyed by the container.
    // It is used to release resources, close connections, save state, etc.

    @PreDestroy
    public void cleanup() {
        System.out.println("App Settings Cleanup.");
    }
}