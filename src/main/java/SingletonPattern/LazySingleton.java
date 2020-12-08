package SingletonPattern;

/**
 * 线程安全的懒汉单例模式
 */
public class LazySingleton {
    private static LazySingleton singleton;

    private LazySingleton() {}

    //写法1
    public static LazySingleton getInstance1() {
        if (singleton == null) {
            synchronized (LazySingleton.class) {
                if (singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }

    //写法2
    public static synchronized LazySingleton getInstance2(){
        if(singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }

    public void showMessage(){
        System.out.println("Hello Singleton!");
    }
}
