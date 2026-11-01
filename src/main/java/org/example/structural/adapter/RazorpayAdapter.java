package org.example.structural.adapter;

public class RazorpayAdapter implements PaymentProcessor {
    // Call the actual razor pay service
    private final Razorpay razorpay;

    public RazorpayAdapter() {
        razorpay = Razorpay.getRazorpayInstance();
    }

    @Override
    public void pay(double amount) {

        razorpay.makePayment(amount);
    }
}
