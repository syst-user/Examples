package com.company.patterns.structural.decorator;

import com.company.patterns.structural.decorator.decorators.BracketsTextView;
import com.company.patterns.structural.decorator.decorators.HtmlTextView;
import com.company.patterns.structural.decorator.decorators.UpperCaseTextView;

public class Main {

    public static void main(String[] args) {
        TextView text = new SimpleTextView("Hello, world!");

        TextView upperCaseText = new UpperCaseTextView(text);
        System.out.println(upperCaseText.getText());

        TextView bracketsText = new BracketsTextView(text);
        System.out.println(bracketsText.getText());

        TextView htmlText = new HtmlTextView(text);
        System.out.println(htmlText.getText());

        TextView comboText = new HtmlTextView(new BracketsTextView(new UpperCaseTextView(text)));
        System.out.println(comboText.getText());
    }
}
