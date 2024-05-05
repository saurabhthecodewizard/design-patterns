package org.factorymethod;

import org.factorymethod.entities.PaymentGateway;
import org.factorymethod.factories.PaymentGatewayFactory;
import org.factorymethod.factories.PaypalGatewayFactory;
import org.factorymethod.factories.StripeGatewayFactory;

public class Main {
    public static void main(String[] args) {
        PaymentGatewayFactory factory =  new PaypalGatewayFactory();
        PaymentGateway gateway = factory.getPaymentGateway();

        gateway.processPayment(3000.0);

        factory = new StripeGatewayFactory();
        gateway = factory.getPaymentGateway();

        gateway.processPayment(5000.0);
    }
}