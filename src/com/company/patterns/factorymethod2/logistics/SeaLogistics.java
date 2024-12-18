package com.company.patterns.factorymethod2.logistics;

import com.company.patterns.factorymethod2.transport.Ship;
import com.company.patterns.factorymethod2.transport.Transport;

public class SeaLogistics extends Logistics {
    @Override
    public Transport crateTransport() {
        return new Ship();
    }
}
