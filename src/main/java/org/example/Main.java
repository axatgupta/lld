package org.example;

import org.example.behavioral.command.Command;
import org.example.behavioral.command.OrderService;
import org.example.behavioral.command.PlaceOrderCommand;
import org.example.structural.composite.Item;
import org.example.structural.decorator.Product;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Product ps5 = new Item(50000.00, "PS5 Console");
        OrderService orderService = new OrderService();
        Command placeOrderCommand = new PlaceOrderCommand(orderService);

        placeOrderCommand.execute(ps5);
    }
}