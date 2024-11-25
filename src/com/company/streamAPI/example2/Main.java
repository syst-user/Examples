package com.company.streamAPI.example2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = Utils.initPersonList();

        String names = personList.stream()
                .map(person -> person.getName())
                .collect(Collectors.joining(", "));
        System.out.println("Names: " + names);

        personList.stream()
                .filter(person -> {
                    System.out.println("F:" + person.getName());
                    return person.getName().length() > 4;
                })
                .map(person -> {
                    System.out.println("M:" + person.getName());
                    return person.getName().toUpperCase();
                })
                .sorted()
                .forEach(name -> System.out.println("Name:" + name));
    }
}
