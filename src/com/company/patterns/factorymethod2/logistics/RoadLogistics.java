package com.company.patterns.factorymethod2.logistics;

import com.company.patterns.factorymethod2.transport.Transport;
import com.company.patterns.factorymethod2.transport.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Transport crateTransport() {
        return new Truck();
    }
}
