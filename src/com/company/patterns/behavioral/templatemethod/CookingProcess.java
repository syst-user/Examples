package com.company.patterns.behavioral.templatemethod;

public abstract class CookingProcess {

    public void cook() { // Template method
        buyIngredients();
        prepareIngredients();
        cookDish();
        serveDish();
    }

    //Отдельные шаги приготовления блюда реализуем в дочерних классах
    abstract void buyIngredients();

    abstract void prepareIngredients();

    abstract void cookDish();

    abstract void serveDish();
}
