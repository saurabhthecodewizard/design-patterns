package org.bridge.service;

import java.util.NoSuchElementException;

public class SinglyLinkedList<T> implements LinkedList<T> {
    private Node<T> head;

    public SinglyLinkedList() {
        this.head = null;
    }

    @Override
    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public void addLast(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("LinkedList is empty");
        }
        T removed = head.data;
        head = head.next;
        return removed;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("LinkedList is empty");
        }
        if (head.next == null) {
            T removed = head.data;
            head = null;
            return removed;
        }
        Node<T> current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        T removed = current.next.data;
        current.next = null;
        return removed;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    private int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
