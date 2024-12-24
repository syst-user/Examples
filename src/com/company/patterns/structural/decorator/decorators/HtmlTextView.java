package com.company.patterns.structural.decorator.decorators;

import com.company.patterns.structural.decorator.TextView;

public class HtmlTextView extends TextViewDecorator {

    public HtmlTextView(TextView decoratedTextView) {
        super(decoratedTextView);
    }

    @Override
    public String getText() { // Подменяем логику
        return wrapToHtml(super.getText());
    }

    private String wrapToHtml(String value) {
        return "<div>" + value + "</div>";
    }
}
