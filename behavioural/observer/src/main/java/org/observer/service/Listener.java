package org.observer.service;

import org.observer.enums.EventType;

public interface Listener {
    void update(EventType eventType);
}
