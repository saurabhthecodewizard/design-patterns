package org.cor.entity;

public class Order {
    private String orderId;
    private double amount;
    private String customerId;
    private String shippingAddress;

    public Order(String orderId, double amount, String customerId, String shippingAddress) {
        this.orderId = orderId;
        this.amount = amount;
        this.customerId = customerId;
        this.shippingAddress = shippingAddress;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
