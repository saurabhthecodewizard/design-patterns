package org.cor.service;

import org.cor.entity.Order;

public interface OrderProcessor {
    void processOrder(Order order);

    void setSuccessor(OrderProcessor successor);
}
