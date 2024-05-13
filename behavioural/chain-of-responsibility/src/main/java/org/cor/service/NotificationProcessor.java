package org.cor.service;

import org.cor.entity.Order;

public class NotificationProcessor extends OrderAction {
    @Override
    protected boolean processRequest(Order order) {
        // Simulated notification logic
        System.out.println("Sending notification for order: " + order.getOrderId());
        return sendNotification(order);
    }

    private boolean sendNotification(Order order) {
        // Simulated notification logic
        System.out.println("Order processed successfully. Notification sent to customer.");
        return true;
    }
}
