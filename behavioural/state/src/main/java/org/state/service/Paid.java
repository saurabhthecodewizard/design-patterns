package org.state.service;

public class Paid implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("Transaction rollback requested to payment gateway");
        return 10;
    }
}
