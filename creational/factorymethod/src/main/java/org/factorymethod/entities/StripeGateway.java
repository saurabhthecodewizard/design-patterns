package org.factorymethod.entities;

public class StripeGateway extends PaymentGateway {
    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing payment of " + amount + " via Stripe");
    }
}
