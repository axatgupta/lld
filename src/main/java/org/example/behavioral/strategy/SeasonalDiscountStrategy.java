package org.example.behavioral.strategy;

public class SeasonalDiscountStrategy implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.9;
    }
}
