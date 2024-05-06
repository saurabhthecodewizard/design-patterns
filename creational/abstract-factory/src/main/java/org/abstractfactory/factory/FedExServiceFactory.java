package org.abstractfactory.factory;

import org.abstractfactory.services.FedExShippingService;
import org.abstractfactory.services.FedExTrackingService;
import org.abstractfactory.services.ShippingService;
import org.abstractfactory.services.TrackingService;

public class FedExServiceFactory extends LogisticsFactory {
    @Override
    public ShippingService createShippingService() {
        return new FedExShippingService();
    }

    @Override
    public TrackingService createTrackingService() {
        return new FedExTrackingService();
    }
}
