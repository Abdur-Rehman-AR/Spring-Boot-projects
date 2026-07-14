package com.example.e_commerce_order_system.tight_coupling;

public class EmailNotification {

    private String smtpServer;

    // constructor now required the server address
    public EmailNotification(String smtpServer) {
        this.smtpServer = smtpServer;
    }

    public void sendEmail() {
        System.out.println("Sending an email to the server: " + smtpServer);
    }
}