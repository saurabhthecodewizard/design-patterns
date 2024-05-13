package org.cor.service;

import org.cor.entity.Order;

public class PaymentProcessor extends OrderAction {
    @Override
    protected boolean processRequest(Order order) {
        // Simulated payment processing logic
        System.out.println("Processing payment for order: " + order.getOrderId());

        // If payment is successful, pass the order to the next processor
        if (isPaymentSuccessful(order)) {
            System.out.println("Payment processed successfully.");
            return true;
        }

        System.out.println("Payment processing failed. Order processing stopped.");
        return false;
    }

    private boolean isPaymentSuccessful(Order order) {
        // Simulated payment processing logic
        return true;
    }
}
