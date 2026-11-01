package org.example.behavioral.strategy;

public class Cart {

    private final PricingRegistry registry;

    public Cart(PricingRegistry pricingRegistry){
        this.registry = pricingRegistry;
    }

    public double calculate(String strategyKey, OrderDetails orderDetails){
        return registry.getPricingStrategy(strategyKey).apply(orderDetails);
    }
}
