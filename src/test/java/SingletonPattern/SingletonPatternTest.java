package SingletonPattern;

import org.junit.Test;

public class SingletonPatternTest {

    @Test
    public void testSingletonObject(){
        SingleObject singleObjectInstance = SingleObject.getInstance();
        singleObjectInstance.showMessage();
    }

    @Test
    public void test2(){
        LazySingleton singleton = LazySingleton.getInstance1();
        singleton.showMessage();
    }

    @Test
    public void test3(){
        LazySingleton singleton = LazySingleton.getInstance2();
        singleton.showMessage();
    }

    @Test
    public void test4(){
//        LazySingleton singleton = LazySingleton.getInstance1();
        HungrySingleton singleton = HungrySingleton.getInstance();
        singleton.showMessage();
    }
}
