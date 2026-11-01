package org.example.structural.decorator;

public class PrimeDelivery extends ProductDecorator{
    public PrimeDelivery(Product product){
        super(product);
    }

    @Override
    public String description() {
        return this.product.description() + "Added prime delivery";
    }

    @Override
    public double price() {
        return this.product.price() + 50.00;
    }
}
