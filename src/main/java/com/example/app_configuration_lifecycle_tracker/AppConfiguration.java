package com.example.app_configuration_lifecycle_tracker;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Configuration annotation is used to tell that this class is a configuration class 
// and it will be used to define beans and their dependencies.

@Configuration
public class AppConfiguration {

    // Bean annotation is used to tell that this method will return a
    // bean that will be managed by the Spring container.

    @Bean
    public AppSettings appSettings() {
        return new AppSettings("Barakah Edits");
    }
}