package com.example.greetingbot.greeting_bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GreetingbotApplication {
	public static void main(String[] args) {

		// This starts the Spring Boot application, creates the IoC container
		// and stores its reference in the context variable.

		ApplicationContext context = SpringApplication.run(GreetingbotApplication.class, args);

		// we are asking the Spring container to give us the bean of type
		// GreetingBot and store its reference in the bot variable.

		GreetingBot bot = context.getBean(GreetingBot.class);

		// calling the display method of the GreetingBot class

		bot.display();
	}
}