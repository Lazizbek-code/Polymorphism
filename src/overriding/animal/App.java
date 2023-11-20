package overriding.animal;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.live();
        animal.eat();

        Mouse mouse = new Mouse();
        mouse.live();
        mouse.eat();

    }
}
