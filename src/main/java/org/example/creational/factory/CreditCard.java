package org.example.creational.factory;

public class CreditCard implements Payment{
    static {
        PaymentFactory.register(PaymentType.CREDIT_CARD, CreditCard::new);
    }
    @Override
    public void pay(double amount) {
        System.out.println("💳 Paid ₹" + amount + " via Credit Card");
    }
}
