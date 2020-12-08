package AdapterPattern;

import org.junit.Test;

public class AdapterTest {
    @Test
    public void test1(){
//        Adapter adapter = new Adapter(cat,dog);

        Cat cat = new Adapter(null,new ConcreteDog());
        cat.catchMouse();

        Dog dog = new Adapter(new ConcreteCat(),null);
        dog.cry();
    }
}
