package com.company.other.queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.add("v1");
        queue.add("v2");
        queue.add("v3");
        queue.add("v4");
        System.out.print("Очередь: ");
        queue.print();

        System.out.println("Удален: " + queue.remove());
        System.out.println("Удален: " + queue.remove());
        System.out.println("Удален: " + queue.remove());
        System.out.println("Удален: " + queue.remove());

        queue.add("v5");
        queue.add("v6");
        queue.add("v7");
        System.out.print("Очередь: ");
        queue.print();

        System.out.println("Удален: " + queue.remove());

        queue.add("v8");
        queue.add("v9");
        queue.add("v10");
        System.out.print("Очередь: ");
        queue.print();

        while (!queue.isEmpty()) {
            System.out.println("Удален: " + queue.remove());
        }
        System.out.print("Очередь: ");
        queue.print();

        queue.add("v11");
        queue.add("v12");
        System.out.print("Очередь: ");
        queue.print();
    }
}
