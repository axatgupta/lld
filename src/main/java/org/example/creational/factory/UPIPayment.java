package org.example.creational.factory;

public class UPIPayment implements Payment{
    static {
        PaymentFactory.register(PaymentType.UPI, UPIPayment::new);
    }
    @Override
    public void pay(double amount) {
        System.out.println("📱 Paid ₹" + amount + " via UPI");
    }
}
