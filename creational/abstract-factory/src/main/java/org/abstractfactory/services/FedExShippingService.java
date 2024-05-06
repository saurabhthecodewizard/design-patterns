package org.abstractfactory.services;

import java.util.UUID;

public class FedExShippingService implements ShippingService {
    /**
     * @param sender        // the person sending the package
     * @param recipient     // the person receiving the package
     * @param address       // the destination address
     * @param weight        // the weight of the package
     */
    @Override
    public void scheduleShipment(String sender, String recipient, String address, Double weight) {
        // logic for scheduling the shipment
        System.out.println("Shipment scheduled by FedEx courier service from " + sender + " to " + recipient + " at " + address + ", and the weight is " + weight + ".");
    }

    /**
     * @param shipmentId    // unique id of shipment
     */
    @Override
    public void cancelShipment(UUID shipmentId) {
        // logic for cancelling the shipment
        System.out.println("Shipment scheduled by FedEx courier service cancelled for UUID: " + shipmentId);
    }
}
