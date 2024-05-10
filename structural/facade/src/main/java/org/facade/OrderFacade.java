package org.facade;

import org.facade.service.BillingSystem;
import org.facade.service.CustomerSystem;
import org.facade.service.InventorySystem;

public class OrderFacade {
    public String getCustomerInfoWithRecentPurchase(int customerId, String productCode) {
        CustomerSystem customerSystem = new CustomerSystem();
        InventorySystem inventorySystem = new InventorySystem();
        BillingSystem billingSystem = new BillingSystem();
        String customerName = customerSystem.getCustomerName(customerId);
        double billAmount = billingSystem.calculateBill(customerId);
        int availableQuantity = inventorySystem.getAvailableQuantity(productCode);

        return "Customer Name: " + customerName + "\n" +
                "Recent Purchase: " + productCode + "\n" +
                "Bill Amount: " + billAmount + "\n" +
                "Available Quantity: " + availableQuantity;
    }
}
