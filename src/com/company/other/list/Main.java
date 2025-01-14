package com.company.other.list;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("v1");
        list.add("v2");
        list.addFirst("v3");
        list.addFirst("v4");
        list.add("v5");
        list.add("v6");
        list.add("v7");
        list.print();

        list.removeLast();
        list.removeFirst();
        list.print();

        list.addByIndex("v0", 2);
        list.print();

        list.removeByIndex(3);
        list.print();

        System.out.println("Contains: " + list.contains("v5"));
        System.out.println("Find: " + list.find("v0"));

        int index = list.find("v0");
        if (index >= 0) {
            list.removeByIndex(index);
        }
        list.print();
    }
}
