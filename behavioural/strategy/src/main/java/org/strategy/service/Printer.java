package org.strategy.service;

import org.strategy.entities.Order;

import java.util.Collection;

public interface Printer {
    void print(Collection<Order> orders);
}
