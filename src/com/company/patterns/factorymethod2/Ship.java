package com.company.patterns.factorymethod2;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Кораблик поплыл");
    }
}
