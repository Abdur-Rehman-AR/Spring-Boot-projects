package com.example.greetingbot.student_management_registry;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendEmail(Student obj) {
        System.out.println("Email sent to: " + obj.getName());
    }
}