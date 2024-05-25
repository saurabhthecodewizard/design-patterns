package org.observer.service;

import org.observer.enums.EventType;

public class EmailListener implements Listener {
    private final String email;

    public EmailListener(String email) {
        this.email = email;
    }

    @Override
    public void update(EventType eventType) {
        // logic to send email
        System.out.println("Sending email to: " + this.email + " for a " + eventType + " event");
    }
}
