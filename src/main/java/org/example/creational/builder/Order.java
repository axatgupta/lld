package org.example.creational.builder;

import java.util.List;

public class Order {
    private String product;
    private String size;
    private String bookType;
    private boolean giftWrapped;
    private String color;
    private boolean bankOfferApplicable;
    private boolean primeDelivery;

    private Order(OrderBuilder orderBuilder){
        this.product = orderBuilder.product;
        this.size = orderBuilder.size;
        this.color = orderBuilder.color;
        this.bankOfferApplicable = orderBuilder.bankOfferApplicable;
        this.primeDelivery = orderBuilder.primeDelivery;
        this.giftWrapped = orderBuilder.giftWrapped;
        this.bookType = orderBuilder.bookType;
    }

    public void showOrderDetails(){
        System.out.println(
            "Order Details : " + product
            + ", size : " + size
            + ", color : " + color
            + ", Gift Wrapped : " + ((giftWrapped) ? " Yes ": " No ")
            + ", Prime Delivery : " + ((primeDelivery) ?" Yes " : " No "));
    }

    public void showBookOrderDetails(){
        System.out.println(
                "Order Details : " + product
                        + ", BookType : " + bookType
                        + ", Gift Wrapped : " + ((giftWrapped) ? " Yes ": " No ")
                        + ", Prime Delivery : " + ((primeDelivery) ?" Yes " : " No "));
    }



    public static class OrderBuilder {
        private String product;
        private String size;
        private boolean giftWrapped;
        private String color;
        private boolean bankOfferApplicable;
        private boolean primeDelivery;
        private String bookType;


        public OrderBuilder(String product){
            this.product = product;
        }

        public OrderBuilder bookType(String bookType){
            this.bookType = bookType;
            return this;
        }

        public OrderBuilder size(String size){
            this.size = size;
            return this;
        }

        public OrderBuilder color(String color){
            this.color = color;
            return this;
        }

        public OrderBuilder giftWrapped(boolean giftWrapped){
            this.giftWrapped = giftWrapped;
            return this;
        }


        public OrderBuilder bankOfferApplicable(boolean bankOfferApplicable){
            this.bankOfferApplicable = bankOfferApplicable;
            return this;
        }

        public OrderBuilder primeDelivery(boolean primeDelivery){
            this.primeDelivery = primeDelivery;
            return this;
        }

        public Order build(){
            return new Order(this );
        }

    }
}
