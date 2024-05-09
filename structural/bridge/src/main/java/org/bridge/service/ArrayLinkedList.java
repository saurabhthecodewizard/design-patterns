package org.bridge.service;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayLinkedList<T> implements LinkedList<T> {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayLinkedList() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void addFirst(T element) {
        ensureCapacity();
        System.arraycopy(array, 0, array, 1, size);
        array[0] = element;
        size++;
    }

    @Override
    public void addLast(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("LinkedList is empty");
        }
        @SuppressWarnings("unchecked")
        T removed = (T) array[0];
        System.arraycopy(array, 1, array, 0, --size);
        return removed;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("LinkedList is empty");
        }
        @SuppressWarnings("unchecked")
        T removed = (T) array[--size];
        array[size] = null;
        return removed;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        @SuppressWarnings("unchecked")
        Node<T> node = new Node<>((T) array[index]);
        return node.data;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }
}
