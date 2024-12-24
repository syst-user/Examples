package com.company.patterns.creational.singleton;

public final class Singleton3 { //Singleton with Lazy initialization + параметры

    private static Singleton3 instance;
    private String value;

    private Singleton3() {} //скрываем дефолтный конструктор

    private Singleton3(String value) {
        this.value = value;
    }

    public static Singleton3 getInstance(String value) {
        if (instance == null) {
            instance = new Singleton3(value);
        }
        return instance;
    }

    //Основная логика

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
