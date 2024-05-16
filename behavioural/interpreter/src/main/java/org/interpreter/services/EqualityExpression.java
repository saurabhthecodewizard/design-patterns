package org.interpreter.services;

import org.interpreter.entities.Discount;

public class EqualityExpression implements Expression {
    private final String key;
    private final String value;

    public EqualityExpression(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean interpret(Discount discount) {
        return discount.get(key).equals(value);
    }
}
