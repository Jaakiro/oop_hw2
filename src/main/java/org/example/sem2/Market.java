package org.example.sem2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    private List<Actor> queue = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println("Пришел в магазин " + actor.getName());
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors){
            System.out.println("Вышел из магазина " + actor.getName());
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println("Встал в очередь " + actor.getName());
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println("Сделал заказ " + actor.getName());
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue){
            if(!actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println("Получил заказ " + actor.getName());
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : queue){
            if(!actor.isTakeOrder()){
                releasedActors.add(actor);
                System.out.println("Вышел из очереди " + actor.getName());
            }
        }
        releaseFromMarket(releasedActors);
    }
}
