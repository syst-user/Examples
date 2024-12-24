package com.company.patterns.behavioral.strategy.strategies;

import com.company.patterns.behavioral.strategy.Order;

public class RegularDeliveryStrategy implements DeliveryStrategy {

    @Override
    public void deliver(Order order) {
        System.out.printf("Delivering order %d via regular delivery", order.getId());
        System.out.println();
    }
}
