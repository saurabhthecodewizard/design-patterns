package org.state.service;

public class New implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("It's a new Order. No processing done");
        // no processing charge
        return 0;
    }
}
