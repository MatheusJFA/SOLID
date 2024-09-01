package com.fullcycle.solid.DIP.right.services;

public class EmailService implements NotificationService {
    @Override
    public void sendNotification(String message, String destination) {
        System.out.println("Email sent to " + destination + " with the message: " + message);
    }
}
