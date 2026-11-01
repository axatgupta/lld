package org.example.creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentFactory implements Factory{
    private static final Map<PaymentType, Supplier<Payment>> registry = new HashMap<>();

    public static void register(PaymentType paymentType, Supplier<Payment> supplier){
        registry.put(paymentType, supplier);
    }


    public static Payment create(PaymentType paymentType){
        Supplier<Payment> supplier = registry.get(paymentType);
        if(supplier == null){
            throw new IllegalArgumentException(" Invalid Payment Type ");
        }
        return supplier.get();
    }

    @Override
    public Factory createFactory() {
        return null;
    }
}