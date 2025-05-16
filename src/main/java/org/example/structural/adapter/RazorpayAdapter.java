package org.example.structural.adapter;

public class RazorpayAdapter implements PaymentPreprocessor {
    // Call the actual razor pay service
    Razorpay razorpay;
    @Override
    public void pay(double amount) {
        razorpay = Razorpay.getRazorpayInstance();
        razorpay.makePayment(amount);
    }
}
