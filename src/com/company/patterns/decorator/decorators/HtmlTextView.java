package com.company.patterns.decorator.decorators;

import com.company.patterns.decorator.TextView;

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
