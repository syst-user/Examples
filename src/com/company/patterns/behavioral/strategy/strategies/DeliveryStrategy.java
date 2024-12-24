package com.company.patterns.behavioral.strategy.strategies;

import com.company.patterns.behavioral.strategy.Order;

public interface DeliveryStrategy {
    void deliver(Order order);
}
