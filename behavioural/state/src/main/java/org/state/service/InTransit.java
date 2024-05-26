package org.state.service;

public class InTransit implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Request sent to courier service for cancellation");
        System.out.println("Transaction rollback requested to payment service");
        return 20;
    }
}
