package org.example.structural.decorator;

public class Insurance extends ProductDecorator {

    public Insurance(Product product){
        super(product);
    }

    @Override
    public String description() {
        return this.product.description() + " now has insurance applied.";
    }

    @Override
    public double price() {
        return this.product.price() + 150.00;
    }
}
