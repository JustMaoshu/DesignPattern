package DecoratorPattern.Order;

/**
 * 调料抽象类
 */
public interface CondimentDecorator extends Beverage{

    String getDescription();

    double cost();
}
