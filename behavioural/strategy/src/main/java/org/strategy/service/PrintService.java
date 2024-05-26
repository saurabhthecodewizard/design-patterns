package org.strategy.service;

import org.strategy.entities.Order;

import java.util.LinkedList;

public class PrintService {
    private Printer printer;

    public PrintService(Printer printer) {
        this.printer = printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void printOrders(LinkedList<Order> orders) {
        printer.print(orders);
    }
}
