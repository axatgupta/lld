package org.example.behavioral.observer;

import org.example.creational.factory.EmailNotification;
import org.example.creational.factory.Notification;
import org.example.creational.factory.NotificationFactory;

public class EmailNotifier implements OrderListener{

    @Override
    public void onOrderUpdate(OrderEvent orderEvent) {
        System.out.println("Email sent for the order " + orderEvent.getOrderId()
                + " status " + orderEvent.getStatus());
    }
}
