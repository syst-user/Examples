package com.company.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> input = new ArrayList<>();
        input.add("mail@mail.com");
        input.add("@google.com");
        input.add("mail@");
        input.add("@");
        input.add("hello");
        input.add("");
        input.add(null);

        input.stream()
                .filter(i -> i != null && !i.isEmpty())
                .map(i -> i.substring(i.indexOf("@") + 1))
                .filter(i -> !i.isEmpty())
                .forEach(i -> System.out.println(i));

        String inputs = "sdf@sd";
        if (inputs.contains("@")) {
            System.out.println("resut:" + inputs.substring(inputs.indexOf("@") + 1));
        } else {
            System.out.println("email is not valid");
        }
    }
}
