package com.company.other.list;

public class LinkedList<T> {

    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void add(T value) { // Добавление элемента в конец
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next; //Ищем последний узел
            }
            current.next = newNode;
        }
    }

    public void addFirst(T value) { // Добавление элемента в начало
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addByIndex(T value, int index) { // Вставка элемента по индексу
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index can not be less than zero");
        }
        if (index == 0) {
            addFirst(value);
            return;
        }
        Node<T> current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException("Index can not be more than length");
        }
        Node<T> newNode = new Node<>(value);
        newNode.next = current.next;
        current.next = newNode;
    }

    public void removeLast() { //Удаление последнего элемента
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node<T> current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null; //удаляем ссылку на последний
    }

    public void removeFirst() { //Удаление первого элемента
        if (head == null) {
            return;
        }
        head = head.next; //перемещаем голову на следующий элемент
    }

    public void removeByIndex(int index) { // Удаление элемента по индексу
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index can not be less than zero");
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node<T> current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) {
            throw new IndexOutOfBoundsException("Index can not be more than length");
        }
        current.next = current.next.next;
    }

    public boolean contains(T value) { //Проверка наличия
        Node<T> current = head;
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int find(T value) { //Поиск по значению
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            if (current.value.equals(value)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println("null");
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
