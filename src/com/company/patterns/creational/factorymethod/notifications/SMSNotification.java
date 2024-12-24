package com.company.patterns.creational.factorymethod.notifications;

public class SMSNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending SMS notification");
    }
}
