package DesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{
    List<Observer> observers = new ArrayList<>();
    private int temperature;

    @Override
    public void add(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void remove(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObserver() {
        observers.stream().forEach( e -> e.notified(temperature));
    }

    @Override
    public void setData(int t) {
        this.temperature = t;
        notifyObserver();
    }
}
