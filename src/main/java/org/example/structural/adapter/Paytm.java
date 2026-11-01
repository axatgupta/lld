package org.example.structural.adapter;

public class Paytm {
    public static volatile Paytm paytmInstance;

    private Paytm(){
        System.out.println("Initialising Paytm Instance ... ");
    }

    public static Paytm getPaytmInstance(){
        if(paytmInstance == null){
            synchronized (Paytm.class){
                if(paytmInstance == null){
                    paytmInstance = new Paytm();
                }
            }
        }
        return paytmInstance;
    }

    public void paytmKaro(double amount){
        System.out.println("Paid : " + amount + " through Paytm");
    }
}
