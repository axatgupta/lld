package org.example.structural.adapter;

public class PaypalAdapter implements PaymentProcessor {
    private final Paypal paypal;

    public PaypalAdapter(){
        paypal = Paypal.getPaypalInstance();
    }
    @Override
    public void pay(double amount) {
        paypal.payViaPayPal(amount);
    }
}

