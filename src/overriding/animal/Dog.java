package overriding.animal;

public class Dog extends Animal{
    @Override
    public void live() {
        System.out.println("Dog live");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
}
