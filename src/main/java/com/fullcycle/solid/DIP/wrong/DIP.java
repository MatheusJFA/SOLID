package com.fullcycle.solid.DIP.wrong;

import com.fullcycle.solid.DIP.wrong.services.*;

public class DIP {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        notificationService.sendNotification("Hello, world!", "test@email.com", "email");
        notificationService.sendNotification("Hello, world!", "1234567890", "sms");
    }
}

