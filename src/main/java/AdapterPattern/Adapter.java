package AdapterPattern;

/**
 * 双向适配器类，让cat可以学狗cry()，dog可以学猫catchMouse()
 */
public class Adapter implements Cat,Dog{
    private Cat cat;
    private Dog dog;

    public Adapter(Cat cat,Dog dog){
        this.cat = cat;
        this.dog = dog;
    }

    @Override
    public void catchMouse() {
        this.dog.cry();
    }

    @Override
    public void cry() {
        this.cat.catchMouse();
    }
}
