package org.example.creational.factory;

public class TelegramNotification implements Notification{
    @Override
    public void notifyUser(String message) {
        System.out.println(" SALE SALE SALE :  " + message);
    }
}
