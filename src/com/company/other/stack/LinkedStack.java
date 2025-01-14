package com.company.other.stack;

public class LinkedStack<T> {

    private Node<T> head; // Вершина стека
    private int size; // Текущий размер стека

    public LinkedStack() {
        this.head = null;
        this.size = 0;
    }

    public void push(T value) { // Добавление элемента на вершину стека
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T pop() { // Удаление элемента с вершины стека
        if (head == null) {
            throw new IllegalStateException("Stack is empty");
        } else {
            T value = head.value; // Берем значение с вершины стека
            head = head.next; // Перемещаем указатель головы на следующий элемент
            size--;
            return value; // Возвращаем удаленный элемент
        }
    }

    public int getSize() {
        return size;
    }

    public void print() {
        Node<T> current = head;
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
