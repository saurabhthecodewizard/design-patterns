package org.state.service;

public class Cancelled implements OrderState {
    @Override
    public double handleCancellation() {
        throw new IllegalStateException("Order has already been cancelled!");
    }
}
