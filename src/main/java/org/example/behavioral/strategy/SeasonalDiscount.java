package org.example.behavioral.strategy;

public class SeasonalDiscount implements DiscountStrategy{
    @Override
    public double apply(OrderDetails orderDetails) {
        return (orderDetails.getCoupon().contains("MONSOON15")) ?
        orderDetails.getAmount() * 0.085 : orderDetails.getAmount();
    }
}
