package DecoratorPattern.Order;

/**
 * 摩卡调料类
 */
public class Mocha implements CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"+Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.2;
    }
}
