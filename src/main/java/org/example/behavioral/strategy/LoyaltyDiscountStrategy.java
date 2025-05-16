package org.example.behavioral.strategy;

public class LoyaltyDiscountStrategy implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.95;
    }
}
