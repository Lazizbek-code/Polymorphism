package overriding.shape;

public class Rectangle extends Shape{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void area() {
        double area = a*b;
        System.out.printf("Rectangle area : %10.2f%n", area);
    }
}
