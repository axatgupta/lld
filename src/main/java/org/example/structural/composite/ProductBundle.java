package org.example.structural.composite;

import org.example.structural.decorator.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle implements Product {
    String description;
    List<Product> productList = new ArrayList<>();

    public ProductBundle(String description){
        this.description = description;
    }

    public void addToProductList(Product product){
        productList.add(product);
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public double price() {
//        double totalPrice = 0;
//        for(Product product : productList){
//            totalPrice+=product.price();
//        }
//        return totalPrice;

        return productList.stream().mapToDouble(Product::price).sum();
    }
}
