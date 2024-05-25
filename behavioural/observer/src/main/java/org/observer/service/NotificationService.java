package org.observer.service;

import org.observer.enums.EventType;

import java.util.*;

public class NotificationService {
    private final Map<EventType, List<Listener>> customers;

    public NotificationService() {
        this.customers = new HashMap<>();
        Arrays.stream(EventType.values()).forEach(eventType -> customers.put(eventType, new ArrayList<>()));
    }

    public void subscribe(EventType eventType, Listener listener) {
        customers.get(eventType).add(listener);
    }

    public void unsubscribe(EventType eventType, Listener listener) {
        customers.get(eventType).remove(listener);
    }

    public void notify(EventType eventType) {
        customers.get(eventType).forEach(listener -> listener.update(eventType));
    }
}
