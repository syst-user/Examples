package com.company.patterns.creational.singleton;

public final class Singleton4 { //Singleton с поддержкой многопоточности

    private static volatile Singleton4 instance; //не забываем volatile

    private Singleton4() {}

    public static Singleton4 getInstance() { //выполняем Double Checked Lock (DCL)
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4(); //только 1 поток сможет создать
                }
            }
        }
        return instance;
    }

    //Основная логика
}
