package com.company.patterns.behavioral.strategy.strategies;

import com.company.patterns.behavioral.strategy.Order;

public class ExpressDeliveryStrategy implements DeliveryStrategy {

    @Override
    public void deliver(Order order) {
        System.out.printf("Delivering order %d via express delivery", order.getId());
        System.out.println();
    }
}
