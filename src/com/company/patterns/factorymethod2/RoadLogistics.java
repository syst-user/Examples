package com.company.patterns.factorymethod2;

public class RoadLogistics extends Logistics {
    @Override
    public Transport crateTransport() {
        return new Truck();
    }
}
