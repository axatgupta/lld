package org.example.behavioral.observer;

public class WhatsappNotifier implements OrderListener {

    @Override
    public void onOrderUpdate(OrderEvent orderEvent) {
        System.out.println("WhatsApp sent for the order " + orderEvent.getOrderId()
                + " status " + orderEvent.getStatus());
    }
}
