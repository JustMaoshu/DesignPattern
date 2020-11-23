package ObserverPattern.WeatherStation;

public class StatisticsDisplay implements Observer,DisplayElement{

    private Subject subject;
    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Subject weatherData){
        this.subject = weatherData;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(this.getClass().getName()+" : temp->"+this.temperature+",humidity->"+this.humidity+",pressure->"+this.pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }
}
