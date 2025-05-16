package org.example.behavioral.observer;

public class SMSNotifier implements OrderObserver{
    @Override
    public void update(String status) {
        System.out.println("SMS : Your shipment is now at: " + status);
    }
}
