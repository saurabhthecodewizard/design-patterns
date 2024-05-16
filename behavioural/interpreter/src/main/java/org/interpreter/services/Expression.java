package org.interpreter.services;

import org.interpreter.entities.Discount;

public interface Expression {
    boolean interpret(Discount discount);
}
