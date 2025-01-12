package com.company.other.defaultmethod;

public class Truck implements Transport {

    @Override
    public void startEngine() {
        System.out.println("Starting Truck");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping Truck");
    }

    //дефолтный метод можно переопределить
}
