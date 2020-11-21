package DecoratorPattern.Order;

/**
 * 低咖啡因咖啡类（一种具体的饮料）
 */
public class Decaf implements Beverage{

    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double cost() {
        return 4.00;
    }
}
