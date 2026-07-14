package com.example.student_management_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        // This creats the spring ioc container and stores its reference in the context
        // variable.
        ApplicationContext context = SpringApplication.run(Main.class, args);

        // we are asking the Spring container to give us the bean of type
        // RegistryService and store its reference in the obj variable.
        RegistryService obj = context.getBean(RegistryService.class);

        // creating a student object and passing the name and age of the student to the
        // constructor of the Student class.
        Student std = new Student("Abdur Rehman", 16);

        // calling the registerStudent method of the RegistryService class and passing
        // the student object to it.
        obj.registerStudent(std);
    }
}