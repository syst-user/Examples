package com.company.patterns.decorator.decorators;

import com.company.patterns.decorator.TextView;

public class UpperCaseTextView extends TextViewDecorator {

    public UpperCaseTextView(TextView decoratedTextView) {
        super(decoratedTextView);
    }

    @Override
    public String getText() { // Подменяем логику
        return super.getText().toUpperCase();
    }
}
