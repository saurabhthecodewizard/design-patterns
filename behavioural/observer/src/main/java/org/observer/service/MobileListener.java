package org.observer.service;

import org.observer.enums.EventType;

public class MobileListener implements Listener {
    private final String userName;

    public MobileListener(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(EventType eventType) {
        // logic to send app notification
        System.out.println("Sending mobile app notification to :" + this.userName + " for " + eventType + " event.");
    }
}
