package org.example.creational.singleton;

public class PaymentGateway {
    private static volatile PaymentGateway paymentGatewayInstance;
    public PaymentGateway(){
        System.out.println("Initializing one instance ...");
    }

    public static PaymentGateway getPaymentGatewayInstance(){
        if(paymentGatewayInstance == null){
            synchronized (PaymentGateway.class){
                if(paymentGatewayInstance == null){
                    paymentGatewayInstance = new PaymentGateway();
                }
            }
        }
        return paymentGatewayInstance;
    }

    public void processPayment(String orderId, double amount){
        System.out.println(" Processing the amount of : " + amount + " against the order id : " + orderId);
    }
}
