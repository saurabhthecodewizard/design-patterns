package org.abstractfactory.services;

import java.util.UUID;

public interface ShippingService {
    void scheduleShipment(String sender, String recipient, String address, Double weight);
    void cancelShipment(UUID shipmentId);
}
