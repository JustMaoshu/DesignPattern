package DecoratorPattern.Order;

/**
 * 深焙咖啡类（一种具体的饮料）
 */
public class DarkRoast implements Beverage{

    @Override
    public String getDescription() {
        return "DarkRoast";
    }

    @Override
    public double cost() {
        return 3.00;
    }
}
