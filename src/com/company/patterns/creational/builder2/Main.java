package com.company.patterns.creational.builder2;

public class Main {

    public static void main(String[] args) {
        Builder builder = new ProgrammerBuilder();
        Director director = new Director(); //часть инициализации делает Director()
        builder = director.createMiddle(builder);
        builder.setFirstName("Ivan");
        builder.setLastName("Sidorov");
        System.out.println(builder.createProgrammer());
    }
}
