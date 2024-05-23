package org.mediator.entities;

import org.mediator.service.AirTrafficControlMediator;

public abstract class Aircraft {
    protected AirTrafficControlMediator mediator;
    protected String id;

    public Aircraft(AirTrafficControlMediator mediator, String id) {
        this.mediator = mediator;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
