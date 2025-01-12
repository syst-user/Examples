package com.company.other.defaultmethod;

public class Main {

    public static void main(String[] args) {
        move(new Car());
        move(new Truck());
    }

    public static void move(Transport transport) {
        transport.startEngine();
        transport.move(); //дефолтный метод
        transport.stopEngine();
    }
}
