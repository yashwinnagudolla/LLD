package designPatterns.observer;

import java.util.ArrayList;
import java.util.list;

public class Amazon {
    private static Amazon instance;

    private List<OrderPlacedSubscriber> orderPlacedSubscribers;

    private Amazon(){
        this.orderPlacedSubscribers = new ArrayList<>();
    }

    public void orderPlaced(){
        for(OrderPlacedSubscriber subscriber:orderPlacedSubscribers){
            subscriber.orderPlaceEvent();
        }
    }

    public Amazon getInstance(){
        if(instance == null){
            synchronized (Amazon.class){
                if(instance == null){
                    this.instance = new Amazon();
                }
            }
        }
        return instance;
    }

    public void registerOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void deRegisterOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }
}