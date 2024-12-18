package com.company.patterns.singleton;

public class Main {

    public static void main(String[] args) {

        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton3 singleton3 = Singleton3.getInstance("Hello world");
        Singleton4 singleton4 = Singleton4.getInstance();
    }
}
