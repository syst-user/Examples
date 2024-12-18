package com.company.patterns.factorymethod;

public class NotificationFactory {

    public Notification createNotification(String channel) {
        switch (channel) {
            case "sms":
                return new SMSNotification();
            case "email":
                return new EmailNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel: " + channel);
        }
    }
}
