package org.interpreter.services;

import org.interpreter.entities.Discount;

public class OrExpression implements Expression {
    private final Expression expression1;
    private final Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(Discount discount) {
        return expression1.interpret(discount) || expression2.interpret(discount);
    }
}
