package com.company.patterns.creational.factorymethod;

import com.company.patterns.creational.factorymethod.notifications.EmailNotification;
import com.company.patterns.creational.factorymethod.notifications.Notification;
import com.company.patterns.creational.factorymethod.notifications.PushNotification;
import com.company.patterns.creational.factorymethod.notifications.SMSNotification;

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
