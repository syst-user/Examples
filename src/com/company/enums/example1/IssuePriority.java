package com.company.enums.example1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public enum IssuePriority implements Priority {
    BLOCKER("Блокер", 1),
    CRITICAL("Критикал", 2),
    HIGH("Высокий", 3),
    NORMAL("Нормал", 4),
    LOW("Низкий", 5);

    private final String description;
    private final int level;

    //Конструктор вызывается один раз для каждого значения
    IssuePriority(String description, int level) {
        this.description = description;
        this.level = level;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getLevel() {
        return level;
    }

    public static List<IssuePriority> getHighPriorities() {
        return filterPriorities(issuePriority -> issuePriority.getLevel() <= 3);
    }

    public static List<IssuePriority> getLowPriorities() {
        return filterPriorities(issuePriority -> issuePriority.getLevel() > 3);
    }

    private static List<IssuePriority> filterPriorities(Predicate<? super IssuePriority> predicate) {
        return Arrays.asList(values()).stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Priority{" +
                "description='" + description + '\'' +
                ", level=" + level +
                '}';
    }
}
