package org.cor.service;

import org.cor.entity.Order;

public abstract class OrderAction implements OrderProcessor {
    private OrderProcessor successor;

    public OrderAction(OrderProcessor orderProcessor) {
        this.successor = orderProcessor;
    }

    public OrderAction() {}

    protected abstract boolean processRequest(Order order);

    @Override
    public void processOrder(Order order) {
        if (processRequest(order) && successor != null) {
            successor.processOrder(order);
        }
    }

    @Override
    public void setSuccessor(OrderProcessor successor) {
        this.successor = successor;
    }
}
