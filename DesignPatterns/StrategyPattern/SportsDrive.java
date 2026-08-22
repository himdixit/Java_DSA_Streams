package DesignPatterns.StrategyPattern;

public class SportsDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("This vehicle supports Sports Drive");
    }
}
