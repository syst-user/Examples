package com.company.patterns.structural.decorator.decorators;

import com.company.patterns.structural.decorator.TextView;

public abstract class TextViewDecorator implements TextView { //Декоратор

    private final TextView decoratedTextView;

    public TextViewDecorator(TextView decoratedTextView) {
        this.decoratedTextView = decoratedTextView;
    }

    @Override
    public String getText() {
        return decoratedTextView.getText();
    }
}
