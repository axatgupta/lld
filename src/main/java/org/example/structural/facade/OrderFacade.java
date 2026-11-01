package org.example.structural.facade;

import org.example.structural.decorator.Product;

public class OrderFacade {
    private Inventory inventory;
    private Shipping shipping;
    private Payment payment;

    public OrderFacade(){
        inventory = new Inventory();
        payment = new Payment();
        shipping = new Shipping();
    }

    public void placeOrder(Product product) {
        try{
            System.out.println("Order is successfully placed!");

            // the orchestrator should now worry about making sure that the order is placed


            System.out.println(" Now processing : "+ product.description());
            payment.processPayment(product.price());
            Thread.sleep(2000);
            inventory.updateInventory(product.description());
            Thread.sleep(2000);
            shipping.arrangeForShipping(product.description());
            Thread.sleep(2000);

        } catch ( InterruptedException e){
            e.printStackTrace();
        }

    }


    public void cancelOrder(Product product) {
        try{
            System.out.println(" Now processing : "+ product.description());
            inventory.updateInventory(product.description());
            Thread.sleep(2000);
            shipping.arrangeForShipping(product.description());
            Thread.sleep(2000);
            payment.processPayment(product.price());
            Thread.sleep(2000);

            System.out.println("Order is successfully cancelled!");
        } catch ( InterruptedException e){
            e.printStackTrace();
        }

    }
}
