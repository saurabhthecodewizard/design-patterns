package org.command.service;

import org.command.dto.NotificationDTO;

public class NotificationService {
    public void sendBulkNotifications(NotificationDTO request) {
        System.out.println("Sending notifications to: " + String.join(", ", request.getRecipients()));
        System.out.println("-------------------------------------");
        // Simulate sending notifications
        // In a real scenario, you would add logic to send notifications to the provided recipients.
    }
}
