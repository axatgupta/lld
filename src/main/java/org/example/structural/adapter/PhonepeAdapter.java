package org.example.structural.adapter;

public class PhonepeAdapter implements PaymentProcessor {

    private final Phonepe phonepeInstance;

    public PhonepeAdapter(){
        phonepeInstance = Phonepe.getPhonepeInstance();
    }
    @Override
    public void pay(double amount) {
        phonepeInstance.payViaPhonepe(amount);
    }
}
