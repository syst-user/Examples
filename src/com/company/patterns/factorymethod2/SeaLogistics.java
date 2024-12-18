package com.company.patterns.factorymethod2;

public class SeaLogistics extends Logistics {
    @Override
    public Transport crateTransport() {
        return new Ship();
    }
}
