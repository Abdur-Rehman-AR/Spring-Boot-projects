package com.example.container_basics.container;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.container_basics.Beans.Person;

public class runapplication {
 
    public static void main(String[] args) {
        
        String loc = "com\\example\\config_files\\applicationContext.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(loc);

        Person p = (Person) context.getBean("id1");
        p.display();

        context.close();
    }
}