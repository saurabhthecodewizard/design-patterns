package org.interpreter.services;

import org.interpreter.entities.Discount;

public class GreaterThanExpression implements Expression {
    private final String key;
    private final int value;

    public GreaterThanExpression(String key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean interpret(Discount discount) {
        return Integer.parseInt(discount.get(key)) > value;
    }
}
