package org.example.creational.singleton;

import lombok.Synchronized;

public class EmailProvider {
    public static volatile EmailProvider emailProvider;

    private EmailProvider(){
        System.out.println("Email Provider initialised.");
    }

    public static EmailProvider getEmailProviderInstance(){
        if(emailProvider == null){
            synchronized (EmailProvider.class){
                if(emailProvider == null){
                    emailProvider = new EmailProvider();
                }
            }
        }
        return emailProvider;
    }

    public void sendEmail(String message){
        System.out.println("Sending an email: "+ message);
    }
}
