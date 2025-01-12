package com.company.other.defaultmethod;

public class Car implements Transport {

    @Override
    public void startEngine() {
        System.out.println("Starting Car");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping Car");
    }

    //дефолтный метод можно переопределить
}
