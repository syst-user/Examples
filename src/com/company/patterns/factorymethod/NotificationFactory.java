package com.company.patterns.factorymethod;

import com.company.patterns.factorymethod.notifications.EmailNotification;
import com.company.patterns.factorymethod.notifications.Notification;
import com.company.patterns.factorymethod.notifications.PushNotification;
import com.company.patterns.factorymethod.notifications.SMSNotification;

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
