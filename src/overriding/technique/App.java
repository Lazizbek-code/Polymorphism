package overriding.technique;

public class App {
    public static void main(String[] args) {
        Technique technique = new Technique();
        technique.work();

        TV tv = new TV();
        tv.work();

        Phone phone = new Phone();
        phone.work();

        Car car = new Car();
        car.work();
    }
}
