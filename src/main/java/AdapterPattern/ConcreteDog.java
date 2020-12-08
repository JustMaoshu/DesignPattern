package AdapterPattern;

public class ConcreteDog implements Dog{
    @Override
    public void cry() {
        System.out.println("狗叫");
    }
}
