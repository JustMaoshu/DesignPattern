package DecoratorPattern.Order;

/**
 * 豆浆调料类
 */
public class Soy implements CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"+Soy";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.3;
    }
}
