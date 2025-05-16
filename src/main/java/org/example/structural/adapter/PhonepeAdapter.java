package org.example.structural.adapter;

public class PhonepeAdapter implements PaymentPreprocessor {

    Phonepe phonepeInstance;

    @Override
    public void pay(double amount) {
        phonepeInstance = Phonepe.getPhonepeInstance();
        phonepeInstance.payViaPhonepe(amount);
    }
}
