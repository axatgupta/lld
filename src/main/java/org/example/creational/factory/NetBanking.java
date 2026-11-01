package org.example.creational.factory;

public class NetBanking implements Payment {

    static {
        // application boot up -- these are the payment instruments supported
        PaymentFactory.register(PaymentType.NET_BANKING, NetBanking::new);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid via netbanking : " + amount);
    }
}
