package org.cor.service;

import org.cor.entity.Order;

public class ShippingProcessor extends OrderAction {
    @Override
    protected boolean processRequest(Order order) {
        // Simulated shipping logic
        System.out.println("Shipping order: " + order.getOrderId());

        // If shipping is successful, pass the order to the next processor
        if (isShipped(order)) {
            System.out.println("Order shipped successfully.");
            return true;
        }

        System.out.println("Shipping failed. Order processing stopped.");
        return false;
    }

    private boolean isShipped(Order order) {
        // Simulated shipping logic
        return true;
    }
}
