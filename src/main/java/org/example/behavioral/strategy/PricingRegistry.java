package org.example.behavioral.strategy;

import java.util.concurrent.ConcurrentHashMap;

public class PricingRegistry {
    private final ConcurrentHashMap<String, DiscountStrategy> strategies = new ConcurrentHashMap<>();

    public void addToRegistry(String key, DiscountStrategy pricingStrategy){
        strategies.putIfAbsent(key, pricingStrategy);
    }

    public void removeFromRegistry(String key){
        strategies.remove(key);
    }

    public DiscountStrategy getPricingStrategy(String key){
        return strategies.get(key);
    }
}
