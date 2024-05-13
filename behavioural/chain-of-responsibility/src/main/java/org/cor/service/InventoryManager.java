package org.cor.service;

import org.cor.entity.Order;

public class InventoryManager extends OrderAction {
    @Override
    protected boolean processRequest(Order order) {
        // Simulated inventory management logic
        System.out.println("Managing inventory for order: " + order.getOrderId());

        // If inventory is available, pass the order to the next processor
        if (isItemAvailable(order)) {
            System.out.println("Inventory managed successfully.");
            return true;
        }

        System.out.println("Insufficient inventory. Order processing stopped.");
        return false;
    }

    private boolean isItemAvailable(Order order) {
        // Simulated inventory availability logic
        return true;
    }
}
