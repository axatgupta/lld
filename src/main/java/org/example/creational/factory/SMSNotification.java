package org.example.creational.factory;

public class SMSNotification implements Notification{

    private static volatile SMSNotification smsNotificationInstance;

    SMSNotification(){
        System.out.println(" Initializing the smsNotificaitonInstance ... ");
    }

    public static SMSNotification getSmsNotificationInstance(){
        if(smsNotificationInstance == null){
            synchronized (SMSNotification.class){
                if(smsNotificationInstance == null){
                    smsNotificationInstance = new SMSNotification();
                }
            }
        }
        return smsNotificationInstance;
    }

    @Override
    public void notifyUser(String message) {
        System.out.println("Sending an SMS to the user about the GRAND SALE !!! XOXO" + message);
    }
}
