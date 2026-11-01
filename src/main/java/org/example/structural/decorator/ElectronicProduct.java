package org.example.structural.decorator;

public class ElectronicProduct implements Product{
    private String description;
    private double price;
    private boolean bankOffers;


    public ElectronicProduct(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public String description() {
        return "";
    }

    @Override
    public double price() {
        return 0;
    }


}
