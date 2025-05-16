package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String status;
    private List<OrderObserver> orderObserverList = new ArrayList<>();

    public void addObserver(OrderObserver observer){
        orderObserverList.add(observer);
    }

    public void removeObserver(OrderObserver observer){
        orderObserverList.remove(observer);
    }


    public void updateStatus(String status){
        this.status = status;
        notifyObservers();
    }


    private void notifyObservers(){
        for(OrderObserver orderObserver : orderObserverList){
            orderObserver.update(status);
        }
    }

}
