package org.example.creational.factory;

public class NotificationFactory {
    public static Notification createNotification(String type){
        if(type.equals("Email")){
            return new EmailNotification();
        } else if ( type.equals("SMS")) {
            return new SMSNotification();
        } else if(type.equals("Whatsapp")) {
            return new WhatsappNotification();
        } else if (type.equals("Telegram")){
            return new TelegramNotification();
        }else {
            throw new IllegalArgumentException("Invalid notification type");
        }
    }
}
