package com.company.patterns.creational.factorymethod2.logistics;

import com.company.patterns.creational.factorymethod2.transport.Transport;

public abstract class Logistics {

    public void doLogistics() {
        Transport transport = crateTransport();
        transport.deliver();
    }

    public abstract Transport crateTransport();
}
