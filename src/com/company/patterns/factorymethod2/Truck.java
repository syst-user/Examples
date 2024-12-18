package com.company.patterns.factorymethod2;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Грузовик поехал");
    }
}
