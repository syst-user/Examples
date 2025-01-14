package com.company.other.queue;

public class Queue<T> {

    private Node<T> head;
    private Node<T> tail;

    public void add(T value) { //добавление в конец
        Node<T> newNode = new Node<>(value);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    public T remove() { //удаление первого элемента
        if (this.head == null) {
            throw new IllegalStateException("Queue is empty");
        }
        Node<T> node = this.head;
        this.head = this.head.next;
        node.next = null;
        return node.value;
    }

    public boolean isEmpty() { //проверка наличия элементов
        return this.head == null;
    }

    public void print() { //печатаем все элементы
        Node<T> current = this.head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    private static final class Node<V> {
        V value;
        Node<V> next;

        public Node(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
