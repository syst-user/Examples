package com.company.patterns.factorymethod2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();

        Logistics logistics = configureLogisticsType(type);
        logistics.doLogistics();
    }

    private static Logistics configureLogisticsType(String type) {
        switch (type) {
            case "truck":
                return new RoadLogistics();
            case "ship":
                return new SeaLogistics();
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
