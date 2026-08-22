package DesignPatterns.ObserverPattern;

public class ObserverPattern {
    public static void main(String[] args) {
        Observer chicago =new ObserverImpl("Chicago");
        Observer delhi =new ObserverImpl("Delhi");

        Observable headStation = new ObservableImpl();
        headStation.add(chicago);
        headStation.add(delhi);
        headStation.setData(25);
    }
}
