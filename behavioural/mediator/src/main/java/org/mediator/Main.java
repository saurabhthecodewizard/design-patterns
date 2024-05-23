package org.mediator;

import org.mediator.entities.Aircraft;
import org.mediator.entities.CargoAircraft;
import org.mediator.entities.PassengerAircraft;
import org.mediator.service.AirTrafficControlMediator;
import org.mediator.service.ControlTower;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mediator Design Pattern");
        System.out.println("--------------------------");

        AirTrafficControlMediator controlTower = new ControlTower();

        Aircraft passengerAircraft1 = new PassengerAircraft(controlTower, "Passenger Aircraft 1");
        Aircraft passengerAircraft2 = new PassengerAircraft(controlTower, "Passenger Aircraft 2");
        Aircraft cargoAircraft1 = new CargoAircraft(controlTower, "Cargo Aircraft 1");
        Aircraft cargoAircraft2 = new CargoAircraft(controlTower, "Cargo Aircraft 2");

        controlTower.registerAircraft(passengerAircraft1);
        controlTower.registerAircraft(passengerAircraft2);
        controlTower.registerAircraft(cargoAircraft1);
        controlTower.registerAircraft(cargoAircraft2);

        passengerAircraft1.send("Requesting landing clearance.");
        System.out.println("---------------------------");
        cargoAircraft2.send("Requesting takeoff clearance");
    }
}