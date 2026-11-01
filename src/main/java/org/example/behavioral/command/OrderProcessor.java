package org.example.behavioral.command;

public class OrderProcessor {
    public void place(String orderId){
        System.out.println("Order placed : " + orderId);
    }

    public void cancelOrder(String orderId){
        System.out.println("Order Cancelled : " + orderId);
    }
}
