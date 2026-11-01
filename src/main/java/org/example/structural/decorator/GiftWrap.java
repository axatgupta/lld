package org.example.structural.decorator;

public class GiftWrap extends ProductDecorator {
    public GiftWrap( Product product ){
        super(product);
    }

    @Override
    public String description() {
        return product.description()
                + " also adding a gift wrap to it.";
    }

    @Override
    public double price() {
        return product.price() + 10.00;
    }
}
