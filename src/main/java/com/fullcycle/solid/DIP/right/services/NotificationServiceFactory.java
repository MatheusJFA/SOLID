package com.fullcycle.solid.DIP.right.services;

public class NotificationServiceFactory {
    private NotificationService notificationService;

    public NotificationServiceFactory(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    
    
    public void sendNotification(String message, String destination) {
        this.notificationService.sendNotification(message, destination);
    }
}
