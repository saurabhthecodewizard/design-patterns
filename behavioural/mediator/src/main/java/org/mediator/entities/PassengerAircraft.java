package org.mediator.entities;

import org.mediator.service.AirTrafficControlMediator;

public class PassengerAircraft extends Aircraft {
    public PassengerAircraft(AirTrafficControlMediator mediator, String id) {
        super(mediator, id);
    }

    @Override
    public void send(String message) {
        System.out.println(this.id + ": Sending Message = " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.id + ": Received Message = " + message);
    }
}
