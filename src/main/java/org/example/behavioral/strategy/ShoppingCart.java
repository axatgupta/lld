package org.example.behavioral.strategy;

public class ShoppingCart {
    private DiscountStrategy discountStrategy;

    public ShoppingCart(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double checkout(double price){
        return discountStrategy.applyDiscount(price);
    }
}
