package org.example.creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationFactory {

    private static final Map<PaymentType, Supplier<Notification>> registry = new HashMap<>();

    public static void register(PaymentType paymentType, Supplier<Notification> supplier){
        registry.put(paymentType, supplier);
    }

    public static Notification createNotification(String type){
        Supplier<Notification> supplier = registry.get(type);
        if(supplier == null){
            throw new IllegalArgumentException(" Invalid Payment Type ");
        }
        return supplier.get();
    }
}
