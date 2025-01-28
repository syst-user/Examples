package com.company.streamAPI.example2;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Person> initPersonList() {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Ivan", Gender.MAIL, 35));
        personList.add(new Person("Ivan", Gender.MAIL, 30));
        personList.add(new Person("Sergei", Gender.MAIL, 30));
        personList.add(new Person("Vasilii", Gender.MAIL, 32));
        personList.add(new Person("Vlad", Gender.MAIL, 25));
        personList.add(new Person("Tanya", Gender.FIMAIL, 28));
        personList.add(new Person("Oksand", Gender.FIMAIL, 30));
        personList.add(new Person("Lida", Gender.FIMAIL, 35));
        personList.add(new Person("Iosif", Gender.MAIL, 33));
        personList.add(new Person("Sveta", Gender.FIMAIL, 26));
        personList.add(new Person("Gena", Gender.FIMAIL, 40));

        return personList;
    }
}
