package DesignPatterns.DecoratorPattern;

public class ExtraVeggie implements Decorator{
    private BasePizza base;

    public ExtraVeggie(BasePizza b)
    {
        this.base=b;
    }

    @Override
    public int cost() {
        return base.cost()+100;
    }
    
}
