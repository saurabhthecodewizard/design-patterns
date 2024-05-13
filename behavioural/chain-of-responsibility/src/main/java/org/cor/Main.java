package org.cor;

import org.cor.entity.Order;
import org.cor.service.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chain Of Responsibility Design Pattern!");
        System.out.println("-------------------------------------------");

        Order order = new Order("12345", 100.0, "Customer123", "123 Main St, City, Country");

        configureOrderProcessor().processOrder(order);
    }

    private static OrderProcessor configureOrderProcessor() {
        // Configuring the order processor chain
        OrderProcessor validator = new OrderValidator();
        OrderProcessor paymentProcessor = new PaymentProcessor();
        OrderProcessor inventoryManager = new InventoryManager();
        OrderProcessor shippingProcessor = new ShippingProcessor();
        OrderProcessor notificationProcessor = new NotificationProcessor();

        // Build the chain
        validator.setSuccessor(inventoryManager);
        inventoryManager.setSuccessor(paymentProcessor);
        paymentProcessor.setSuccessor(shippingProcessor);
        shippingProcessor.setSuccessor(notificationProcessor);

        return validator;
    }
}