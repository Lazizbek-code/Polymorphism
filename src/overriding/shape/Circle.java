package overriding.shape;
import static java.lang.Math.*;
public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double area = PI*pow(radius, 2);
        System.out.printf("Circle area : %10.2f%n", area);
    }
}
