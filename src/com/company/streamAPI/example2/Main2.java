package com.company.streamAPI.example2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {
        List<Person> personList = Utils.initPersonList();

        Map<Gender, List<Person>> groupedByGender = personList.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        System.out.println("Count: " + groupedByGender.size());

        Person[] personArray = {
                new Person("ivan", Gender.MAIL, 20),
                new Person("petr", Gender.MAIL, 21),
                new Person("ivan", Gender.MAIL, 22),
                new Person("petr", Gender.MAIL, 23),
                new Person("stepan", Gender.MAIL, 24)
        };

        Map<String, List<Person>> groupedByName = Arrays.stream(personArray)
                .collect(Collectors.groupingBy(Person::getName, LinkedHashMap::new, Collectors.toList()));
        System.out.println("Count: " + groupedByName.size());
    }
}
