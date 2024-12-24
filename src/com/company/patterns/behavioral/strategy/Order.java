package com.company.patterns.behavioral.strategy;

import com.company.patterns.behavioral.strategy.strategies.DeliveryStrategy;

public class Order {

    private final int id;
    private DeliveryStrategy deliveryStrategy;

    public Order(int id, DeliveryStrategy deliveryStrategy) {
        this.id = id;
        this.deliveryStrategy = deliveryStrategy;
    }

    public void processDelivery() {
        this.deliveryStrategy.deliver(this);
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public int getId() {
        return id;
    }
}
