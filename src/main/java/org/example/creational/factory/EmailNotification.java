package org.example.creational.factory;

import org.example.creational.singleton.EmailProvider;

public class EmailNotification implements Notification{

    EmailProvider emailProvider;
    public EmailNotification(){
        emailProvider = EmailProvider.getEmailProviderInstance();
    }


    @Override
    public void notifyUser(String message) {
        emailProvider.sendEmail(message);
        System.out.println("Sending an email notification to the user about their order it's now ...." + message);
    }
}
