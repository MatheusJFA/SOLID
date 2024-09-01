package com.fullcycle.solid.DIP.right.services;

public class SMSService implements NotificationService {
    @Override
    public void sendNotification(String message, String destination) {
        System.out.println("SMS sent to " + destination + " with the message: " + message);
    }
}
