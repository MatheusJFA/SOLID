package com.fullcycle.solid.DIP.wrong.services;

public class EmailService {
    public void sendEmail(String message, String destination) {
        System.out.println("Email sent to " + destination + " with the message: " + message);
    }
}
