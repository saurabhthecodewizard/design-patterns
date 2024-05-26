package org.strategy.service;

import org.strategy.entities.Order;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class DetailPrinter implements Printer {
    @Override
    public void print(Collection<Order> orders) {
        System.out.println("*************** Detail Report *************");
        Iterator<Order> iterator = orders.iterator();
        int index = 1;
        double total = 0;
        while (iterator.hasNext()) {
            double orderTotal = 0;
            Order order = iterator.next();
            System.out.println(index++ + ". " + order.getId() + " \t" + order.getDate());
            for (Map.Entry<String, Double> entry : order.getItems().entrySet()) {
                System.out.println("\t\t" + entry.getKey() + "\t" + entry.getValue());
                orderTotal += entry.getValue();
            }
            System.out.println("----------------------------------------");
            System.out.println("\t\tTotal  " + orderTotal);
            System.out.println("----------------------------------------");
            total += orderTotal;
        }
        System.out.println("---------------------------------------------");
        System.out.println("\t\tGrand Total: " + total);
        System.out.println("********************************************");
    }
}
