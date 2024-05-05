package org.factorymethod.factories;

import org.factorymethod.entities.PaymentGateway;

public abstract class PaymentGatewayFactory {
    public PaymentGateway getPaymentGateway() {
        PaymentGateway gateway = createPaymentGateway();
        gateway.setMerchantId("Payment Gateway Merchant ID");
        gateway.setEnvironment("Payment Gateway Environment");

        return gateway;
    }

    protected abstract PaymentGateway createPaymentGateway();
}
