package org.abstractfactory.services;

public class FedExTrackingService implements TrackingService {
    /**
     * @param trackingNumber    // unique id of the tracking
     * @return                  // shipment static
     */
    @Override
    public String trackShipment(Long trackingNumber) {
        return "FedEx shipment in transit";
    }
}
