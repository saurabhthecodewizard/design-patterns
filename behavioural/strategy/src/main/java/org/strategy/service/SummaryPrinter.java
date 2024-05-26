package org.strategy.service;

import org.strategy.entities.Order;

import java.util.Collection;
import java.util.Iterator;

public class SummaryPrinter implements Printer {
    @Override
    public void print(Collection<Order> orders) {
        System.out.println("*************** Summary Report *************");
        Iterator<Order> iterator = orders.iterator();
        int index = 1;
        double total = 0;
        while (iterator.hasNext()) {
            Order currentOrder = iterator.next();
            System.out.println(index++ + ". " + currentOrder.getId() + "\t" + currentOrder.getDate() + "\t" + currentOrder.getItems().size() + "\t" + currentOrder.getTotal());
            total += currentOrder.getTotal();
        }
        System.out.println("---------------------------------------------");
        System.out.println("\t\t\t\tTotal: " + total);
        System.out.println("********************************************");
    }
}
