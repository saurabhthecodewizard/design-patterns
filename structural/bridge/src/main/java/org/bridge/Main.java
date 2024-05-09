package org.bridge;

import org.bridge.collection.LifoCollection;
import org.bridge.collection.Stack;
import org.bridge.service.LinkedList;
import org.bridge.service.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bridge Design Pattern");
        System.out.println("------------------------");

        LinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();

        LifoCollection<Integer> lifoCollection = new Stack<>(singlyLinkedList);

        lifoCollection.push(1);
        lifoCollection.push(2);
        lifoCollection.push(3);

        System.out.println("Peek: " + lifoCollection.peek()); // Output: 3

        System.out.println("Pop: " + lifoCollection.poll()); // Output: 3
        System.out.println("Pop: " + lifoCollection.poll()); // Output: 2

        System.out.println("Is Stack Empty? " + lifoCollection.isEmpty()); // Output: false

        lifoCollection.push(4);

        while (!lifoCollection.isEmpty()) {
            System.out.println("Pop: " + lifoCollection.poll());
        }

        System.out.println("Is Stack Empty? " + lifoCollection.isEmpty());
    }
}