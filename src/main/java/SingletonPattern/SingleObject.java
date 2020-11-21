package SingletonPattern;

/**
 * 线程不安全的单例模式，多线程同时进入会造成instance被多次实例化，所以在多线程不能正常工作
 */
public class SingleObject {

    private static SingleObject instance;

    private SingleObject(){}

    public static SingleObject getInstance(){
        if(instance == null){
            instance = new SingleObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello SingleObject!");
    }

}
