package org.mediator.service;

import org.mediator.entities.Aircraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ControlTower implements AirTrafficControlMediator {
    private final List<Aircraft> aircrafts;

    public ControlTower() {
        this.aircrafts = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, Aircraft aircraft) {
        for (Aircraft a : aircrafts) {
            // Do not send the message to the sender
            if (!Objects.equals(a.getId(), aircraft.getId())) {
                a.receive(message);
            }
        }
    }

    @Override
    public void registerAircraft(Aircraft aircraft) {
        this.aircrafts.add(aircraft);
    }
}
