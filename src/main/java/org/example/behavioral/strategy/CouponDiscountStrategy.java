package org.example.behavioral.strategy;

public class CouponDiscountStrategy implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.80;
    }
}
