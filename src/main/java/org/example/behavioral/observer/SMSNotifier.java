package org.example.behavioral.observer;

import org.example.creational.factory.Notification;
import org.example.creational.factory.SMSNotification;

public class SMSNotifier implements OrderListener{
    @Override
    public void onOrderUpdate(OrderEvent orderEvent) {
        System.out.println("SMS sent for the order " + orderEvent.getOrderId()
                + " status " + orderEvent.getStatus());
    }
}
