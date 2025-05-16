package org.example.structural.adapter;

public class Paypal {
    private static volatile Paypal paypalInstance;
    Paypal(){
        System.out.println("Initializing one Paypal instance ...");
    }

    public static Paypal getPaypalInstance(){
        if(paypalInstance == null){
            synchronized (Paypal.class){
                if(paypalInstance == null){
                    paypalInstance = new Paypal();
                }
            }
        }
        return paypalInstance;
    }

    public void paypalPayment(double amount){
        System.out.println("Payment of : " + amount + " has been paid by Paypal!");
    }
}
