package com.fullcycle.solid.DIP.wrong.services;

public class SMSService {
    public void sendSMS(String message, String destination) {
        System.out.println("SMS sent to " + destination + " with the message: " + message);
    }
}
