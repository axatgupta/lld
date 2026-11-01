package org.example.structural.adapter;

public class Phonepe {
    private static volatile Phonepe phonepeInstance;
    Phonepe(){
        System.out.println("Initializing one Phonepe instance ...");
    }

    public static Phonepe getPhonepeInstance(){
        if(phonepeInstance == null){
            synchronized (Phonepe.class){
                if(phonepeInstance == null){
                    phonepeInstance = new Phonepe();
                }
            }
        }
        return phonepeInstance;
    }

    public void payViaPhonepe(double amount){
        System.out.println("Payment of : " + amount + " has been paid by Phonepe!");
    }
}
