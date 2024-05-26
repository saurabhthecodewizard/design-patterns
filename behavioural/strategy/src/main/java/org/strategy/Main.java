package org.strategy;

import org.strategy.entities.Order;
import org.strategy.service.DetailPrinter;
import org.strategy.service.PrintService;
import org.strategy.service.SummaryPrinter;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Design Pattern");
        System.out.println("------------------------");
        LinkedList<Order> orders = createOrders();

        PrintService service = new PrintService(new SummaryPrinter());
        service.printOrders(orders);

        service = new PrintService(new DetailPrinter());
        service.printOrders(orders);
    }

    private static LinkedList<Order> createOrders() {
        LinkedList<Order> orders = new LinkedList<>();
        Order o = new Order("100");
        o.addItem("Soda", 2.0);
        o.addItem("Chips", 10.0);
        orders.add(o);

        o = new Order("200");
        o.addItem("Cake", 20.0);
        o.addItem("Cookies", 5.0);
        orders.add(o);

        o = new Order("300");
        o.addItem("Burger", 8.0);
        o.addItem("Fries", 5.0);
        orders.add(o);

        return orders;
    }
}