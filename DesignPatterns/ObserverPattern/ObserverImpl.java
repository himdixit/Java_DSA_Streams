package DesignPatterns.ObserverPattern;

public class ObserverImpl implements Observer{

    private String name;
    public ObserverImpl(String nm) {
        this.name = nm;
    }
    @Override
    public void notified(int t) {
        System.out.println("Weather Station "+ name+ " got notification that temperature of head station is "+ t +" Celsius");
    }

}
