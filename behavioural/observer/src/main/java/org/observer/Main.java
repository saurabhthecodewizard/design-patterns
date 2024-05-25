package org.observer;

import org.observer.enums.EventType;
import org.observer.service.EmailListener;
import org.observer.service.Listener;
import org.observer.service.MobileListener;
import org.observer.service.Store;

public class Main {
    public static void main(String[] args) {
        System.out.println("Observer Design Pattern");
        System.out.println("-------------------------");

        Listener johnDoe = new EmailListener("john@doe.com");
        Listener janeDoe = new EmailListener("jane@doe.com");
        Listener someGuy = new EmailListener("some@guy.com");
        Listener johnDoeDevice = new MobileListener("JohnDoeDevice");

        Store store = new Store();
        store.subscribe(EventType.NEW_ITEM, johnDoe);
        store.subscribe(EventType.SALE, janeDoe);
        store.subscribe(EventType.SALE, someGuy);
        store.subscribe(EventType.NEW_ITEM, johnDoeDevice);

        System.out.println("New Item Promotion...");
        store.newItemPromotion();

        System.out.println("-------------------------");

        System.out.println("Sale Promotion...");
        store.salePromotion();

        System.out.println("-------------------------");

        store.unsubscribe(EventType.SALE, someGuy);

        System.out.println("Sale Promotion...");
        store.salePromotion();
    }
}