package ObserverPattern.WeatherStation;

/**
 * 当前状况布告板（一个观察者实例）
 */
public class CurrentConditionDisplay implements Observer,DisplayElement{

    //持有主题对象，是为了观察者能够注册和删除
    private Subject subject;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Subject weatherData){
        this.subject = weatherData;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }

    @Override
    public void display() {
        System.out.println(this.getClass().getName()+" : temp->"+this.temperature+",humidity->"+this.humidity+",pressure->"+this.pressure);
    }
}
