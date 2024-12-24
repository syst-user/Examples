package com.company.patterns.decorator.decorators;

import com.company.patterns.decorator.TextView;

public class BracketsTextView extends TextViewDecorator {

    public BracketsTextView(TextView decoratedTextView) {
        super(decoratedTextView);
    }

    @Override
    public String getText() { // Подменяем логику
        return wrapToBrackets(super.getText());
    }

    private String wrapToBrackets(String value) {
        return "[" + value + "]";
    }
}
