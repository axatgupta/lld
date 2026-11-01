package org.example.creational.builder;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
//@Builder
public class Order {
    @NonNull
    private String orderId;
    private String userId;
    private long createdAt;
    private String orderStatus;
    private long baseAmount;
    private long finalPrice;
    private boolean emi;
    private String deliveryType;
    private boolean bankOfferApplicable;
    private String couponCode;
    private String size;
    private String bookType;

    private Order(OrderBuilder ob){
        this.finalPrice = ob.finalPrice;
        this.userId = ob.userId;
        this.couponCode = ob.couponCode;
        this.bankOfferApplicable = ob.bankOfferApplicable;
    }
    public static class OrderBuilder {
        private String product;
        private String orderId;
        private String userId;
        private long createdAt;
        private String orderStatus;
        private long baseAmount;
        private long finalPrice;
        private boolean emi;
        private String deliveryType;
        private boolean bankOfferApplicable;
        private String couponCode;
        private String size;
        private String bookType;
        private String color;

        OrderBuilder(String product){
            this.product = product;
        }

        public OrderBuilder size(String size){
            this.size = size;
            return this;
        }

        public OrderBuilder color(String color){
            this.color = color;
            return this;
        }

        public Order build(){
            return new Order(this);
        }


    }
    // constructor -- bare min information to create an order.
//    public Order(OrderBuilder orderBuilder){
//        this.size = orderBuilder.size;
//        this.emi = orderBuilder.emi;
//        this.couponCode = orderBuilder.couponCode;
//        this.deliveryType = orderBuilder.deliveryType;
//        this.bankOfferApplicable = orderBuilder.bankOfferApplicable;
//    }


    public void showOrderDetails(){
        System.out.println("Order has "
        +
                finalPrice + " "
        +
                orderId + " "
        +
                orderStatus + " "
        +
                bankOfferApplicable);

    }

}
