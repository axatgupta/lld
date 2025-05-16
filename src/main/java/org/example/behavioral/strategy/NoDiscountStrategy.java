package org.example.behavioral.strategy;

public class NoDiscountStrategy implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount;
    }
}
