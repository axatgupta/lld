package org.example.behavioral.strategy;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double apply(OrderDetails orderDetails) {
        return orderDetails.getAmount();
    }
}
