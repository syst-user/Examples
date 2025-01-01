package com.company.enums.example1;

public class Main {

    public static void main(String[] args) {
        IssuePriority priority1 = IssuePriority.CRITICAL;
        if (priority1.getLevel() <= 3) {
            System.out.printf("Priority description: %s level: %d %n", priority1.getDescription(), priority1.getLevel());
        }
        System.out.println("Priority name: " + priority1.name());
        System.out.println("Priority ordinal: " + priority1.ordinal());

        IssuePriority priority2 = IssuePriority.valueOf("NORMAL");
        System.out.println("Priority2: " + priority2);

        System.out.println("---All values----------------------");
        for (IssuePriority priority : IssuePriority.values()) {
            System.out.println(priority);
        }

        System.out.println("---Values with High Priorities------");
        for (IssuePriority priority : IssuePriority.getHighPriorities()) {
            System.out.println(priority);
        }

        System.out.println("---Values with Low Priorities-------");
        for (IssuePriority priority : IssuePriority.getLowPriorities()) {
            System.out.println(priority);
        }
    }
}
