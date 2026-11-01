package org.example.behavioral.strategy;

public class CouponDiscount implements DiscountStrategy {
    @Override
    public double apply(OrderDetails orderDetails) {
        return orderDetails.getCoupon().contains("SAVE10") ?
                orderDetails.getAmount() * 0.90 :
                orderDetails.getAmount();
    }
}
