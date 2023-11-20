package overloading;

public class MyMath {
    public double calculation(String a, int b){
        return Double.parseDouble(a) + b;
    }

    public double calculation(String a, double b){
        return Double.parseDouble(a) + b;
    }
    public double calculation(String a, String b){
        return Double.parseDouble(a) + Double.parseDouble(b);
    }
    public double calculation(int a, int b){
        return  a + b;
    }

    public double calculation(double a, double b){
        return  a + b;
    }

    public double calculation(double a, int b){
        return  a + b;
    }

    public static void main(String[] args) {
        MyMath math = new MyMath();
        System.out.println(math.calculation("12", 15));
        System.out.println(math.calculation("12", 15D));
        System.out.println(math.calculation("12", "15"));
        System.out.println(math.calculation(12, 15));
        System.out.println(math.calculation(12D, 15D));
        System.out.println(math.calculation(12D, 15));
    }
}
