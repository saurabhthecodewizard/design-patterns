package org.bridge.collection;

import org.bridge.service.LinkedList;

public class Stack<T> implements LifoCollection<T> {
    private LinkedList<T> list;
    public Stack(LinkedList<T> list) {
        this.list = list;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public T peek() {
        return list.get(0);
    }

    @Override
    public T poll() {
        return list.removeFirst();
    }

    @Override
    public void push(T data) {
        list.addFirst(data);
    }
}
