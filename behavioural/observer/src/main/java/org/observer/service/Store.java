package org.observer.service;

import org.observer.enums.EventType;

public class Store {
    private final NotificationService service;

    public Store() {
        this.service = new NotificationService();
    }

    public void subscribe(EventType eventType, Listener listener) {
        service.subscribe(eventType, listener);
    }

    public void unsubscribe(EventType eventType, Listener listener) {
        service.unsubscribe(eventType, listener);
    }

    public void newItemPromotion() {
        service.notify(EventType.NEW_ITEM);
    }

    public void salePromotion() {
        service.notify(EventType.SALE);
    }
}
