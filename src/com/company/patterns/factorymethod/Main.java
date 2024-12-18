package com.company.patterns.factorymethod;

import com.company.patterns.factorymethod.notifications.Notification;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String channel = scanner.nextLine();

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification(channel);
        notification.notifyUser();
    }
}
