package org.example.behavioral.command;

import org.example.behavioral.observer.OrderService;

public class PlaceOrderCommand implements Command {

    private final OrderProcessor orderProcessor;
    private final String orderId;

    public PlaceOrderCommand(OrderProcessor orderProcessor, String orderId) {
        this.orderProcessor = orderProcessor;
        this.orderId = orderId;
    }

    @Override
    public void execute() {
        orderProcessor.place(orderId);
    }

    @Override
    public void undo() {
        orderProcessor.cancelOrder(orderId);
    }
}
