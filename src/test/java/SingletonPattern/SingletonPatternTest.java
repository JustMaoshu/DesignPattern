package SingletonPattern;

import org.junit.Test;

public class SingletonPatternTest {

    @Test
    public void testSingletonObject(){
        SingleObject singleObjectInstance = SingleObject.getInstance();
        singleObjectInstance.showMessage();
    }

}
