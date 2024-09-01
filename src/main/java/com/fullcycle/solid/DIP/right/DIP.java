package com.fullcycle.solid.DIP.right;

import com.fullcycle.solid.DIP.right.services.*;

public class DIP {
    public static void main(String[] args) {
        NotificationServiceFactory notificationEmailServiceFactory = new NotificationServiceFactory(new EmailService());
        notificationEmailServiceFactory.sendNotification("Hello, World!", "test.email@com");

        NotificationServiceFactory notificationSMSServiceFactory = new NotificationServiceFactory(new SMSService());
        notificationSMSServiceFactory.sendNotification("Hello, World!", "1234567890");
    }
}

