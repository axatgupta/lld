package org.example.creational.factory;

public class SlackNotification implements Notification{
    @Override
    public void notifyUser(String message) {
        System.out.println("SLACK MESSAGE BLA BLA BLA BLA ....");
    }
}
