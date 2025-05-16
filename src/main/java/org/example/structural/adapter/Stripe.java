package org.example.structural.adapter;

public class Stripe {
    private static volatile Stripe stripeInstance;
    Stripe(){
        System.out.println("Initializing one Stripe instance ...");
    }

    public static Stripe getStripeInstance(){
        if(stripeInstance == null){
            synchronized (Stripe.class){
                if(stripeInstance == null){
                    stripeInstance = new Stripe();
                }
            }
        }
        return stripeInstance;
    }

    public void payment(double amount){
        System.out.println("Payment of : " + amount + " has been paid by Stripe!");
    }
}
