package com.company.patterns.behavioral.templatemethod;

public class PastaCooking extends CookingProcess {

    @Override
    void buyIngredients() {
        System.out.println("Buying pasta, tomato sauce and cheese.");
    }

    @Override
    void prepareIngredients() {
        System.out.println("Preparing pasta sauce, chopping onions.");
    }

    @Override
    void cookDish() {
        System.out.println("Boiling pasta and adding sauce.");
    }

    @Override
    void serveDish() {
        System.out.println("Serving pasta with cheese.");
    }
}
