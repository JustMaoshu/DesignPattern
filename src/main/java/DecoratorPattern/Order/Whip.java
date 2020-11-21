package DecoratorPattern.Order;

/**
 * 奶泡调料类
 */
public class Whip implements CondimentDecorator{

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"+Whip";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.4;
    }
}
