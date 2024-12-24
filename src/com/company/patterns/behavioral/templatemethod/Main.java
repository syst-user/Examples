package com.company.patterns.behavioral.templatemethod;

public class Main {

    public static void main(String[] args) {
        CookingProcess past = new PastaCooking();
        past.cook(); //Готовим пасту

        System.out.println("-------------------------");

        CookingProcess steak = new SteakCooking();
        steak.cook(); //готовим стейк
    }
}
