package DesignPatterns.StrategyPattern;

public class Vehicle {
    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy st)
    {
        this.driveStrategy = st;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
