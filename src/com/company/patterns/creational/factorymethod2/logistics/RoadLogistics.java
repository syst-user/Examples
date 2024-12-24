package com.company.patterns.creational.factorymethod2.logistics;

import com.company.patterns.creational.factorymethod2.transport.Transport;
import com.company.patterns.creational.factorymethod2.transport.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Transport crateTransport() {
        return new Truck();
    }
}
