package org.example.structural.adapter;

public class StripeAdapter implements PaymentProcessor {

    private final Stripe stripeInstance;
    public StripeAdapter(){
        stripeInstance = Stripe.getStripeInstance();
    }
    @Override
    public void pay(double amount) {
        stripeInstance.payment(amount);
    }
}
