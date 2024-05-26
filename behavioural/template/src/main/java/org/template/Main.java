package org.template;

import org.template.entities.Order;
import org.template.service.HtmlPrinter;
import org.template.service.Printer;
import org.template.service.TextPrinter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Template Method Pattern");
        System.out.println("-------------------------");

        Order order = new Order("1001");

        order.addItem("Book", 2.50);
        order.addItem("Shelf", 11.95);
        order.addItem("Table", 15.95);

        Printer printer = new HtmlPrinter();
        printer.printOrder(order, "orders.html");
        printer = new TextPrinter();
        printer.printOrder(order, "orders.text");
    }
}