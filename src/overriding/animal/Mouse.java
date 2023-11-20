package overriding.animal;

public class Mouse extends Animal{
    @Override
    public void live() {
        System.out.println("Mouse live");
    }

    @Override
    public void eat() {
        System.out.println("Mouse eat");
    }
}
