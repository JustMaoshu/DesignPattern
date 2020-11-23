package ObserverPattern.WeatherStation;

/**
 * 观察者接口类，为主题提供通知观察者的方法update()
 */
public interface Observer {

    void update(float temperature,float humidity,float pressure);
}
