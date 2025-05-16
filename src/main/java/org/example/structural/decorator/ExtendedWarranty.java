package org.example.structural.decorator;

public class ExtendedWarranty extends ProductDecorator {

    public ExtendedWarranty(Product product){
        super(product);
    }

    @Override
    public String description() {
        StringBuilder sb = new StringBuilder();
        sb.append(product.description());
        sb.append(" Adding extended warranty to the product. ");
        return sb.toString();
    }

    @Override
    public double price() {
        return product.price() + 100.00;
    }
}
