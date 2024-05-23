package org.mediator.service;

import org.mediator.entities.Aircraft;

public interface AirTrafficControlMediator {
    void sendMessage(String message, Aircraft aircraft);
    void registerAircraft(Aircraft aircraft);
}
