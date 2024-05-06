package org.abstractfactory.factory;

import org.abstractfactory.services.ShippingService;
import org.abstractfactory.services.TrackingService;
import org.abstractfactory.services.UPSShippingService;
import org.abstractfactory.services.UPSTrackingService;

public class UPSServiceFactory extends LogisticsFactory {
    @Override
    public ShippingService createShippingService() {
        return new UPSShippingService();
    }

    @Override
    public TrackingService createTrackingService() {
        return new UPSTrackingService();
    }
}
