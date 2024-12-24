package com.company.patterns.creational.builder2;

import java.util.ArrayList;
import java.util.List;

public class Director { //Director опциональный класс патерна. Позволяет вынести инициализацию

    public Builder createJunior(Builder builder) {
        List<String> hardSkills = new ArrayList<>();
        hardSkills.add("Java Core");
        builder.setHardSkills(hardSkills);
        List<String> sortSkills = new ArrayList<>();
        sortSkills.add("Трудолюбивый");
        builder.setSoftSkills(sortSkills);
        return builder;
    }

    public Builder createMiddle(Builder builder) {
        List<String> hardSkills = new ArrayList<>();
        hardSkills.add("Java Core");
        hardSkills.add("Java EE");
        hardSkills.add("Spring");
        builder.setHardSkills(hardSkills);
        List<String> sortSkills = new ArrayList<>();
        sortSkills.add("Трудолюбивый");
        sortSkills.add("Ответсвенный");
        builder.setSoftSkills(sortSkills);
        return builder;
    }

    public Builder createSenior(Builder builder) {
        List<String> hardSkills = new ArrayList<>();
        hardSkills.add("Spring");
        hardSkills.add("Kafka");
        hardSkills.add("Микросервисы");
        builder.setHardSkills(hardSkills);
        List<String> sortSkills = new ArrayList<>();
        sortSkills.add("Трудолюбивый");
        sortSkills.add("Ответсвенный");
        sortSkills.add("Коммуникабельный");
        builder.setSoftSkills(sortSkills);
        return builder;
    }
}
