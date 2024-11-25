package com.company.generics;

public class Main3 {

    //Пример отдельного дженерик метода
    public static void main(String[] args) {
        System.out.println(method("Hello"));

    }

    private static <T> T method(T t) {
        return t;
    }
}
