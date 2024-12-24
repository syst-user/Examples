package com.company.patterns.creational.factorymethod.notifications;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending Email notification");
    }
}
