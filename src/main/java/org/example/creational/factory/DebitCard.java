package org.example.creational.factory;

public class DebitCard implements Payment{

    static {
        PaymentFactory.register(PaymentType.DEBIT_CARD, DebitCard::new);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Making the payment of : " + amount + " via Platinum debit card.");
    }
}
