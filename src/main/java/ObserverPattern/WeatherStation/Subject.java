package ObserverPattern.WeatherStation;

/**
 * 主题接口
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 注销观察者
     * @param observer
     * @return
     */
    boolean deleteObserver(Observer observer);

    /**
     * 通知所有的观察者，通过观察者自己的update()实现通知
     */
    void notifyObservers();
}
