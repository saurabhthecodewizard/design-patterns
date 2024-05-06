package org.abstractfactory;

import org.abstractfactory.factory.FedExServiceFactory;
import org.abstractfactory.factory.LogisticsFactory;
import org.abstractfactory.factory.UPSServiceFactory;
import org.abstractfactory.services.ShippingService;
import org.abstractfactory.services.TrackingService;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Pattern");
        System.out.println("********************************");

        printShipmentDetails(new FedExServiceFactory());
        printShipmentDetails(new UPSServiceFactory());
    }

    private static void printShipmentDetails(LogisticsFactory factory) {
        ShippingService shippingService = factory.createShippingService();
        TrackingService trackingService = factory.createTrackingService();

        shippingService.scheduleShipment("John Doe", "Jane Doe", "Dubai", 55.0);
        shippingService.cancelShipment(UUID.randomUUID());

        System.out.println(trackingService.trackShipment(53243L));

        System.out.println("-----------------------------------------------------------------------");
    }
}