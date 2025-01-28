package com.company.streamAPI.example2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = Utils.initPersonList();

        String names = personList.stream()
                .map(Person::getName)
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


        //-----Example 2
        System.out.println("-----Example 2:");
        Stream<Person> personStream = personList.stream()
                .filter(person -> {
                    System.out.println("filter name: " + person.getName());
                    return "Ivan".equals(person.getName());
                });
        System.out.println("after stream");

        // Две терминальные операции для одного стрима приведут к ошибке (Стрим одноразовый объект)
        //List<Person> collect2 = personStream.collect(Collectors.toList());
        long count = personStream.count();
        System.out.println("count: " + count);
    }
}
