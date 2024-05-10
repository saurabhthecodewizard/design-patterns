package org.facade;

public class Main {
    public static void main(String[] args) {
        System.out.println("Facade Design Pattern");
        System.out.println("------------------------");
        OrderFacade facade = new OrderFacade();
        int customerId = 123;
        String productCode = "PROD001";
        String customerInfo = facade.getCustomerInfoWithRecentPurchase(customerId, productCode);
        System.out.println(customerInfo);
    }
}