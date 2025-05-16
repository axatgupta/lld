package org.example.behavioral.observer;

import org.example.creational.factory.EmailNotification;
import org.example.creational.factory.Notification;

public class EmailNotifier implements OrderObserver{
    Notification emailNotification;

    @Override
    public void update(String status) {
        emailNotification = new EmailNotification();
        emailNotification.notifyUser(status);
    }
}
