package org.example.behavioral.observer;

import org.example.creational.factory.Notification;
import org.example.creational.factory.NotificationFactory;
import org.example.creational.factory.SlackNotification;

public class SlackNotifier implements OrderListener{

    @Override
    public void onOrderUpdate(OrderEvent orderEvent) {
        System.out.println("Slack update sent for the order " + orderEvent.getOrderId());
    }
}
