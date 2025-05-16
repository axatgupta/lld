package org.example.behavioral.observer;

public class WhatsappNotifier implements OrderObserver{
    @Override
    public void update(String status) {
        System.out.println("Whatsapp notification : Your order is at : " + status);
    }
}
