package com.company.patterns.creational.factorymethod2.logistics;

import com.company.patterns.creational.factorymethod2.transport.Ship;
import com.company.patterns.creational.factorymethod2.transport.Transport;

public class SeaLogistics extends Logistics {
    @Override
    public Transport crateTransport() {
        return new Ship();
    }
}
