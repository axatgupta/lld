package org.example.behavioral.observer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EventBus {
    List<OrderListener> listeners = new CopyOnWriteArrayList<>();
    private final ExecutorService executorService = Executors.newFixedThreadPool(5);

    public void subscribe(OrderListener orderListener){
        listeners.add(orderListener);
    }

    public void publish(OrderEvent orderEvent){
        for(OrderListener orderListener : listeners){
            executorService.submit(() -> orderListener.onOrderUpdate(orderEvent));
        }
    }
}
