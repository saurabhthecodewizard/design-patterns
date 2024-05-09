package org.bridge.service;

public interface LinkedList<T> {
    void addFirst(T element);
    void addLast(T element);
    T removeFirst();
    T removeLast();
    boolean isEmpty();
    T get(int index);
}
