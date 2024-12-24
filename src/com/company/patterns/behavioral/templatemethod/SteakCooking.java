package com.company.patterns.behavioral.templatemethod;

public class SteakCooking extends CookingProcess {

    @Override
    void buyIngredients() {
        System.out.println("Buying steak, salt and pepper.");
    }

    @Override
    void prepareIngredients() {
        System.out.println("Preparing steak.");
    }

    @Override
    void cookDish() {
        System.out.println("Frying steak.");
    }

    @Override
    void serveDish() {
        System.out.println("Serving steak.");
    }
}
