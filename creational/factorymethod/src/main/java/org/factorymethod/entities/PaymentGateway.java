package org.factorymethod.entities;

public abstract class PaymentGateway {
    private String merchantId;
    private String environment;

    public abstract void processPayment(Double amount);

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
