package DesignPatterns.ObserverPattern;

public interface Observable {
    void add(Observer obj);
    void remove(Observer obj);
    void notifyObserver();
    void setData(int t);
}
