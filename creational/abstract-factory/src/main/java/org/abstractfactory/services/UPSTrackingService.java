package org.abstractfactory.services;

public class UPSTrackingService implements TrackingService {
    /**
     * @param trackingNumber    // unique id of the tracking
     * @return                  // shipment static
     */
    @Override
    public String trackShipment(Long trackingNumber) {
        return "UPS shipment in transit";
    }
}
