package overriding.animal;

public class Cat extends Animal{
    @Override
    public void live() {
        System.out.println("Cat live");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }
}
