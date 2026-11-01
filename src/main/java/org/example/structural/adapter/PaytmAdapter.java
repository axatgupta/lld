package org.example.structural.adapter;

public class PaytmAdapter implements PaymentProcessor{
    private final Paytm paytmInstance;
    public PaytmAdapter(){
        paytmInstance = Paytm.getPaytmInstance();
    }
    @Override
    public void pay(double amount) {
        paytmInstance.paytmKaro(amount);
    }
}
