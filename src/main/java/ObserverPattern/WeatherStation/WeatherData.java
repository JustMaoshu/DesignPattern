package ObserverPattern.WeatherStation;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 主题实例，拥有一个所有观察者的列表，发生变化时通知观察者
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public boolean deleteObserver(Observer observer) {
        return observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while(it.hasNext()){
            it.next().update(this.temperature,this.humidity,this.pressure);
        }
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    public void measurementsChanged(){
        notifyObservers();
    }
}
