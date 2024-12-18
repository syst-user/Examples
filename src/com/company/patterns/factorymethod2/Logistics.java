package com.company.patterns.factorymethod2;

public abstract class Logistics {

    public void doLogistics() {
        Transport transport = crateTransport();
        transport.deliver();
    }

    public abstract Transport crateTransport();
}
