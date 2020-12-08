package SingletonPattern;

/**
 * 线程安全的饿汉单例模式
 */
public class HungrySingleton {
    private final static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return singleton;
    }

    public void showMessage(){
        System.out.println("Hello Singleton!");
    }
}
