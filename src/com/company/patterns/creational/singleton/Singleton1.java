package com.company.patterns.creational.singleton;

public final class Singleton1 { //Singleton с статической инициализацией

    private final static Singleton1 instance = new Singleton1();

    private Singleton1() {}

    public static Singleton1 getInstance() {
        return instance;
    }

    //Основная логика
}
