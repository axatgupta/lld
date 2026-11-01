package org.example.structural.adapter;

public class Razorpay {
    private static volatile Razorpay razorpayInstance;
    Razorpay(){
        System.out.println("Initializing one razorpay instance ...");
    }

    public static Razorpay getRazorpayInstance(){
        if(razorpayInstance == null){
            synchronized (Razorpay.class){
                if(razorpayInstance == null){
                    razorpayInstance = new Razorpay();
                }
            }
        }
        return razorpayInstance;
    }

    public void makePayment(double amount){
        System.out.println("Payment of : " + amount + " has been paid by Razorpay!");
    }
}
