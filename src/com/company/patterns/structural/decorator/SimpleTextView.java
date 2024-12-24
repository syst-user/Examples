package com.company.patterns.structural.decorator;

public class SimpleTextView implements TextView { //Исходный объект c базовой логикой

    private final String text;

    public SimpleTextView(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
