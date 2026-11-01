package org.example.structural.decorator;

public abstract class ProductDecorator implements Product {
    protected Product product;
    ProductDecorator(Product product){
        this.product = product;
    }
}
