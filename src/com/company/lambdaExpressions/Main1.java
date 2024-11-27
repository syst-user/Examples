package com.company.lambdaExpressions;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class Main1 {

    static int valueField = 0;

    public static void main(String[] args) {

        // Пытаемся изменить локальную переменную из лямбды
        int value = 5;
        Consumer<Integer> consumer = integer -> {
            System.out.println(integer);
            //value = 10; // не можем поменять локальную переменную из лямбды
        };
        callConsumer(consumer, 1);
        System.out.println("value: " + value);


        //----------Example2-----------
        AtomicInteger value2 = new AtomicInteger(5);
        Consumer<Integer> consumer2 = integer -> {
            System.out.println(integer);
            value2.set(10); // Можем использовать атомики
        };
        callConsumer(consumer2, 2);
        System.out.println("value: " + value2);


        //----------Example3-----------
        final int[] value3 = {5};
        Consumer<Integer> consumer3 = integer -> {
            System.out.println(integer);
            value3[0] = 15; // Можем использовать массив
        };
        callConsumer(consumer3, 3);
        System.out.println("value: " + value3[0]);


        //----------Example4-----------
        Consumer<Integer> consumer4 = integer -> {
            System.out.println(integer);
            valueField = 20; // поле класса
        };
        callConsumer(consumer4, 4);
        System.out.println("value: " + valueField);
    }

    private static void callConsumer(Consumer<Integer> consumer, int value) {
        consumer.accept(value);
    }
}
