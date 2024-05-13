package org.cor.service;

import org.cor.entity.Order;

public class OrderValidator extends OrderAction {
    @Override
    protected boolean processRequest(Order order) {
        // Perform order validation logic
        System.out.println("Validating order: " + order.getOrderId());

        if (isOrderValid(order)) {
            System.out.println("Order validation passed.");
            return true;
        }

        System.out.println("Order validation failed. Order processing stopped.");
        return false;
    }

    private boolean isOrderValid(Order order) {
        // Simulated order validation logic
        return order.getAmount() > 0 && order.getShippingAddress() != null && !order.getShippingAddress().isEmpty();
    }
}
