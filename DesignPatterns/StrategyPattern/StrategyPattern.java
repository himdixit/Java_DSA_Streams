package DesignPatterns.StrategyPattern;

public class StrategyPattern {
    public static void main(String[] args) {
        Vehicle vNormal = new Vehicle(new NormalDrive());
        vNormal.drive();

        Vehicle vSports = new Vehicle(new SportsDrive());
        vSports.drive();
    }
}
