package AdapterPattern;

public class ConcreteCat implements Cat{

    @Override
    public void catchMouse() {
        System.out.println("捉老鼠");
    }
}
