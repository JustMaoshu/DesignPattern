package DecoratorPattern;

public interface CondimentDecorator extends Beverage{

    String getDescription();

    double cost();
}
