package org.example.behavioral.observer;

import org.example.creational.factory.Notification;
import org.example.creational.factory.TelegramNotification;

public class TelegramNotifier implements OrderListener {
    @Override
    public void onOrderUpdate(OrderEvent orderEvent) {
        System.out.println("Telegram sent for the order " + orderEvent.getOrderId());
    }
}
