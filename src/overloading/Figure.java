package overloading;

public class Figure {
    // overloading
    public int calculation(int a, int b){
        return 2 * (a+b);
    }

    public int calculation(int a){
        return 4 * a;
    }

    public int calculation(int a, int b, int c){
        return a+b+c;
    }

    public int calculation(int a, int b, int c, int d, int f){
        return a+b+c+d+f;
    }

    public static void main(String[] args) {
        Figure figure = new Figure();
        System.out.println("To'g'ri to'rtburchak perimetri = " + figure.calculation(2,3));
        System.out.println("Uchburchak perimetri = " + figure.calculation(4,3, 5));
        System.out.println("Kvadrat perimetri = " + figure.calculation(4));
        System.out.println("BeshBurchak perimetri = " + figure.calculation(4, 5, 6, 7, 8));
    }
}
