package com.company.patterns.factorymethod;

public class PushNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending Push notification");
    }
}
