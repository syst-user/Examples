package com.company.patterns.singleton;

public final class Singleton2 { //Singleton with Lazy initialization

    private static Singleton2 instance;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    //Основная логика
}
