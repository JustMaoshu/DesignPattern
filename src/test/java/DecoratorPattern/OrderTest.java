package DecoratorPattern;

import org.junit.Test;

public class OrderTest {
    @Test
    public void test1(){
        Beverage beverage = new Mocha(new DarkRoast());
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
