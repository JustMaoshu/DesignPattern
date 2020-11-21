package DecoratorPattern.Order;

/**
 * 浓缩咖啡类（一种具体饮料）
 */
public class Espresso implements Beverage{
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
