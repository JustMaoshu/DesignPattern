package DecoratorPattern;

import DecoratorPattern.Order.*;
import org.junit.Test;

import java.text.DecimalFormat;

public class OrderTest {
    /**
     * 深焙咖啡加摩卡
     */
    @Test
    public void test1(){
        Beverage beverage = new Mocha(new DarkRoast());
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }

    /**
     * 浓缩咖啡加双倍豆浆再加奶泡
     */
    @Test
    public void test2(){
//        Beverage beverage1 = new Espresso();
//        System.out.println(beverage1.cost());
//        Beverage beverage2 = new Soy(beverage1);
//        System.out.println(beverage2.cost());
//        Beverage beverage3 = new Soy(beverage2);
//        System.out.println(beverage3.cost());
//        Beverage beverageFinal = new Whip(beverage3);
//        System.out.println(beverageFinal.getDescription());
//        DecimalFormat df = new DecimalFormat("0.0");
//        System.out.println(df.format(beverageFinal.cost()));
        Beverage beverage = new Whip(new Soy(new Soy(new Espresso())));
        System.out.println(beverage.getDescription());
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(df.format(beverage.cost()));
    }
}
