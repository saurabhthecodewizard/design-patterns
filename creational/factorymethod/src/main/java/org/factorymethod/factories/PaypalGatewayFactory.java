package org.factorymethod.factories;

import org.factorymethod.entities.PaymentGateway;
import org.factorymethod.entities.PaypalGateway;

public class PaypalGatewayFactory extends PaymentGatewayFactory {
    @Override
    protected PaymentGateway createPaymentGateway() {
        return new PaypalGateway();
    }
}
