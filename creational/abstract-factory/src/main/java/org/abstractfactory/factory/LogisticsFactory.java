package org.abstractfactory.factory;

import org.abstractfactory.services.ShippingService;
import org.abstractfactory.services.TrackingService;

public abstract class LogisticsFactory {
    public abstract ShippingService createShippingService();

    public abstract TrackingService createTrackingService();
}
