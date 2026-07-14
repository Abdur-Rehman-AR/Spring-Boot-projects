package com.example.container_basics.container;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.container_basics.Beans.Student;

public class Main {
    public static void main(String[] args) {
        
        String config_loc = "com\\example\\config_files\\applicationContext.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config_loc);

        Student s = (Student) context.getBean("id1");
        s.display();

        context.close();        
    }
}