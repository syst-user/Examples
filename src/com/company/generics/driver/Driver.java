package com.company.generics.driver;

public class Driver <T>  {

    T transport;

    public Driver(T transport) {
        this.transport = transport;
    }

    public void drive() {
        System.out.println("Drive: " + transport.getClass().getName());
    }

    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        this.transport = transport;
    }
}
