package ObserverPattern;

import ObserverPattern.WeatherStation.*;
import org.junit.Test;

public class WeatherStationTest {
    @Test
    public void test1(){
        WeatherData wd = new WeatherData();
        //创建观察者的过程，也是主题注册观察者的过程
        Observer ob1 = new CurrentConditionDisplay(wd);
        Observer ob2 = new StatisticsDisplay(wd);
        wd.setMeasurements(80,65,30.4f);
        wd.setMeasurements(78,45.6f,22.9f);
    }
}
