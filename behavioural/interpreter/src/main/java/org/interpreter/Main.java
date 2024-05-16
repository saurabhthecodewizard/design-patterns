package org.interpreter;

import org.interpreter.entities.Discount;
import org.interpreter.services.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Interpreter Design Pattern");
        System.out.println("------------------------------");

        Discount context = new Discount();
        context.add("CustomerType", "VIP");
        context.add("OrderValue", "1500");
        context.add("ProductCategory", "Electronics");

        // Build the rule: "CustomerType == 'VIP' AND OrderValue > 1000"
        Expression vipAndHighValueOrder = getAndExpression();

        // Build the rule: "ProductCategory == 'Electronics' OR (ProductCategory == 'Books' AND OrderValue > 500)"
        Expression electronicsOrBooksAndHighValueOrder = getOrExpression();

        // Evaluate the rules
        boolean isVipAndHighValueOrder = vipAndHighValueOrder.interpret(context);
        boolean isEligibleForDiscount = electronicsOrBooksAndHighValueOrder.interpret(context);

        System.out.println("Is VIP and high value order: " + isVipAndHighValueOrder);
        System.out.println("Is eligible for discount: " + isEligibleForDiscount);
    }

    private static Expression getAndExpression() {
        Expression customerTypeIsVIP = new EqualityExpression("CustomerType", "VIP");
        Expression orderValueGreaterThan1000 = new GreaterThanExpression("OrderValue", 2000);
        return new AndExpression(customerTypeIsVIP, orderValueGreaterThan1000);
    }

    private static Expression getOrExpression() {
        Expression productCategoryIsElectronics = new EqualityExpression("ProductCategory", "Electronics");
        Expression productCategoryIsBooks = new EqualityExpression("ProductCategory", "Books");
        Expression orderValueGreaterThan500 = new GreaterThanExpression("OrderValue", 500);
        Expression booksAndHighValueOrder = new AndExpression(productCategoryIsBooks, orderValueGreaterThan500);
        return new OrExpression(productCategoryIsElectronics, booksAndHighValueOrder);
    }
}