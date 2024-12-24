package com.company.patterns.decorator.decorators;

import com.company.patterns.decorator.TextView;

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
