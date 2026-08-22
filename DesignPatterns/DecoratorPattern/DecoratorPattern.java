package DesignPatterns.DecoratorPattern;

public class DecoratorPattern {
    public static void main(String[] args) {
        BasePizza baseMag = new Margharita();
        BasePizza baseVeg = new VegDelight();

        System.out.println("Margharita Price:"+baseMag.cost());
        System.out.println("Veg Delight Price:"+baseVeg.cost());

        Decorator extraCheezeMag = new ExtraCheeze(baseMag);
        System.out.println("Margharita Extra Cheeze Price:"+extraCheezeMag.cost());
    }
}
