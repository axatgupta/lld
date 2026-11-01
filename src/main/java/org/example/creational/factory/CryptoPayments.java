package org.example.creational.factory;

public class CryptoPayments implements Payment{

    static {
        PaymentFactory.register(PaymentType.CRYPTO, CryptoPayments::new);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment was made using BTC");
    }
}
