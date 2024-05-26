package org.state;

import org.state.service.Order;

public class Main {
    public static void main(String[] args) {
        System.out.println("State Design Pattern");
        System.out.println("----------------------");

        Order order = new Order();

        order.paymentSuccessful();
        order.dispatched();

        order.cancel();
    }
}