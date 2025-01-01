package com.company.enums.example3;

public enum Counter { //Использование enum для реализации Singleton паттерна

    INSTANCE;

    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public void process() {
        System.out.println("Processing: " + value);
    }
}
