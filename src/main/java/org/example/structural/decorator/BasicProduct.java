package org.example.structural.decorator;

public class BasicProduct implements Product {


    private String description;
    private double price;

    public BasicProduct(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public double price() {
        return price;
    }
}
