package DesignPatterns.DecoratorPattern;

public class ExtraCheeze implements Decorator{
    private BasePizza base;

    public ExtraCheeze(BasePizza b)
    {
        this.base = b;
    }
    @Override
    public int cost() {
        return base.cost()+150;
    }

}
