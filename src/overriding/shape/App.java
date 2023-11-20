package overriding.shape;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(4D);
        circle.area();

        Rectangle rectangle = new Rectangle(3,4);
        rectangle.area();
    }
}
