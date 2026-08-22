package DesignPatterns.StrategyPattern;

public class NormalDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("THis Vehicle support Normal Drive");
    }
}
