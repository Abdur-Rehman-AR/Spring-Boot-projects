package com.example.greetingbot.student_management_registry;

import org.springframework.stereotype.Service;

/* 
* this service class is used to apply the business logic of the application. 
* It is used to register a student based on their age. 
* If the student is less than 18 years old, they are registered successfully, 
* otherwise, the registration fails.
*/

@Service
public class RegistryService {

    /*
     * We use final for injected dependencies to make them immutable, prevent
     * accidental
     * reassignment and ensure the object always uses the same dependency throughout
     * its lifecycle.
     */

    private final NotificationService notificationService;

    // Constructor-based dependency injection. Spring injects the NotificationService 
    // bean into the RegistryService through the constructor
    public RegistryService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerStudent(Student obj) {
        if (obj.getAge() < 18) {
            System.out.println("Student Registered Successfully with name: " + obj.getName());
            notificationService.sendEmail(obj);
        } else
            System.out.println("Student Registration Failed with name: " + obj.getName());
    }
}