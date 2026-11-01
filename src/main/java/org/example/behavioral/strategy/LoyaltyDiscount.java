package org.example.behavioral.strategy;

public class LoyaltyDiscount implements DiscountStrategy {
    @Override
    public double apply(OrderDetails orderDetails) {
        return orderDetails.getCoupon().contains("GOLD") ?
                orderDetails.getAmount() * 0.85 :
                orderDetails.getAmount();
    }
}
