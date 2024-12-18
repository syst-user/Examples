package com.company.patterns.factorymethod2.logistics;

import com.company.patterns.factorymethod2.transport.Transport;

public abstract class Logistics {

    public void doLogistics() {
        Transport transport = crateTransport();
        transport.deliver();
    }

    public abstract Transport crateTransport();
}
