package org.example.behavioral.observer;

public class TelegramNotifier implements OrderObserver{
    @Override
    public void update(String status) {
        System.out.println("Telegram : the order is now : " + status);
    }
}
