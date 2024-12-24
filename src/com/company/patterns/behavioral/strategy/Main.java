package com.company.patterns.behavioral.strategy;

import com.company.patterns.behavioral.strategy.strategies.CourierDeliveryStrategy;
import com.company.patterns.behavioral.strategy.strategies.ExpressDeliveryStrategy;
import com.company.patterns.behavioral.strategy.strategies.RegularDeliveryStrategy;

public class Main {

    public static void main(String[] args) {
        Order order1 = new Order(1, new RegularDeliveryStrategy());
        order1.processDelivery();

        Order order2 = new Order(2, new ExpressDeliveryStrategy());
        order2.processDelivery();

        order2.setDeliveryStrategy(new CourierDeliveryStrategy());
        order2.processDelivery();
    }
}
