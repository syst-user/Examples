package com.company.other.defaultmethod;

public interface Transport {
    void startEngine();
    void stopEngine();

    default void move() { //дефолтный метод с реализацие
        System.out.println("Moving...");
    }
}
