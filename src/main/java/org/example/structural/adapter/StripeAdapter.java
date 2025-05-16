package org.example.structural.adapter;

public class StripeAdapter implements PaymentPreprocessor {

    Stripe stripeInstance;
    @Override
    public void pay(double amount) {
        stripeInstance = Stripe.getStripeInstance();
        stripeInstance.payment(amount);
    }
}
