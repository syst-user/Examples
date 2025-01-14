package com.company.other.stack;

public class Main {
    public static void main(String[] args) {

        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("v1");
        stack.push("v2");
        stack.push("v3");
        stack.push("v4");
        stack.push("v5");
        stack.print();
        System.out.println("size: " + stack.getSize());

        System.out.println("Извлечен: " + stack.pop());
        System.out.println("Извлечен: " + stack.pop());
        stack.print();
        System.out.println("size: " + stack.getSize());
    }
}
