package org.state.service;

public class Delivered implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Request sent to courier service for item pick up");
        System.out.println("Transaction rollback will be to payment service after successful item pickup");
        return 50;
    }
}
