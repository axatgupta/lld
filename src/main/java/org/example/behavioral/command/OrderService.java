package org.example.behavioral.command;

import org.example.structural.decorator.Product;
import org.example.structural.facade.OrderFacade;


public class OrderService {
    OrderFacade orderFacade = new OrderFacade();
    public void placeOrder(Product product){
        orderFacade.placeOrder(product);
    }


    public void cancelOrder(Product product){
        orderFacade.cancelOrder(product);
    }
}
