package org.example.structural.adapter;

public class PaypalAdapter implements PaymentPreprocessor {
    private Paypal paypal;

    @Override
    public void pay(double amount) {
        paypal = Paypal.getPaypalInstance();
        paypal.paypalPayment(amount);
    }
}
