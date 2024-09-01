package com.fullcycle.solid.DIP.wrong.services;

public class NotificationService {
    private final EmailService emailService;
    private final SMSService smsService;
    
    public NotificationService() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }
    
    public void sendNotification(String message, String destination, String type) {
        // This class is directly dependent on the EmailService and SMSService classes
        // As you can see, the NotificationService class is directly dependent on the EmailService and SMSService classes.
        // This is a violation of the Dependency Inversion Principle because the NotificationService class is directly dependent on the EmailService and SMSService classes.
        // This means that if we want to change the EmailService or SMSService classes, we will have to change the NotificationService class as well.
        // Or if we want to add a new service, we will have to change the NotificationService class to add the new service.
        if (type.equals("email")) {
            this.emailService.sendEmail(message, destination);
        } else if (type.equals("sms")) {
            this.smsService.sendSMS(message, destination);
        } else {
            System.out.println("Invalid notification type");
        }
    }
}
