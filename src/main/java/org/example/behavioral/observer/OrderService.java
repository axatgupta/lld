package org.example.behavioral.observer;

public class OrderService {
    private final EventBus eventBus;

    public OrderService(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void updateStatus(String orderId, String status){
        System.out.println("Order " + orderId + " updated to " + status);
        eventBus.publish(new OrderEvent(orderId, status));
    }
}
