package com.example.greetingbot.greeting_bot;

/*
* import the @Component annotation from the spring framewok so that
* we can mark this class as a bean managed by the Spring container.
*/
import org.springframework.stereotype.Component;

@Component
public class GreetingBot {

    public void display() {
        System.out.println("Hi, I am your 1st spring boot bean.");
    }
}