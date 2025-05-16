package org.example.creational.factory;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser(String message) {
        System.out.println("Sending an email notification to the user about their order it's now ...." + message);
    }
}
