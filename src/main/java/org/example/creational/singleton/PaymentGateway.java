package org.example.creational.singleton;


public class PaymentGateway {
    private static volatile PaymentGateway paymentGateway;

    private PaymentGateway(){
        System.out.println("Initializing a payment gateway....");
    }

    public static PaymentGateway getPaymentGatewayInstance(){
        if(paymentGateway==null){
            synchronized (PaymentGateway.class){
                if(paymentGateway == null){
                    paymentGateway = new PaymentGateway();
                }
            }
        }
        return paymentGateway; // T1,
    }// T2, T1

    public void pay(double amount){
        System.out.println("Paid amount ₹"+amount);
    }
}



