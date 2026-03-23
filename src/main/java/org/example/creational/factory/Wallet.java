package org.example.creational.factory;

public class Wallet implements Payment{
    static {
        PaymentFactory.register(PaymentType.WALLET, Wallet::new);
    }
    @Override
    public void pay(double amount) {
        System.out.println("👛 Paid ₹" + amount + " via Wallet");
    }
}
