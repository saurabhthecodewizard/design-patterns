package org.factorymethod.factories;

import org.factorymethod.entities.PaymentGateway;
import org.factorymethod.entities.StripeGateway;

public class StripeGatewayFactory extends PaymentGatewayFactory {
    @Override
    protected PaymentGateway createPaymentGateway() {
        return new StripeGateway();
    }
}
