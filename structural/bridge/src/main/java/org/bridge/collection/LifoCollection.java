package org.bridge.collection;

import org.bridge.service.LinkedList;

public interface LifoCollection<T> {
    abstract boolean isEmpty();

    abstract T peek();

    abstract T poll();

    abstract void push(T data);
}
