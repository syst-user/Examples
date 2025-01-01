package com.company.records;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Ivan", 25, "Moscow");
        user1.print();

        User user2 = new User("Petr", 29, "Voronezh");
        System.out.printf("Name2: %s %n", user2.name());

        User user3 = new User("Radion", 27, "Moscow");
        User user4 = new User("Vasili", 30);

        List<User> users = List.of(user1, user2, user3, user4);

        System.out.println("---Users from Moscow---");
        users.stream()
                .filter(user -> "Moscow".equals(user.city()))
                .forEach(System.out::println);
    }
}
