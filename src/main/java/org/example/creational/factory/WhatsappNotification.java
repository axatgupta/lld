package org.example.creational.factory;

public class WhatsappNotification implements Notification{
    @Override
    public void notifyUser(String message) {
        System.out.println(" OMG GUYZZZZZ THE SALE IS ABOUT TO BEGINNNN !!! AAAAAHHHHH XOXOXOXO ..." + message);
    }
}
