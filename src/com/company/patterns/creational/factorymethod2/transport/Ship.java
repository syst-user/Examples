package com.company.patterns.creational.factorymethod2.transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Кораблик поплыл");
    }
}
