import java.util.Scanner;

public class AreaCalculator {
    public float calculateArea(float radius) {
        return (float) (Math.PI * radius * radius);
    }

    public float calculateArea(float length, float breadth) {
        return length * breadth;
    }

    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            AreaCalculator calc = new AreaCalculator();

            if (sc.hasNextFloat()) {
                float radius = sc.nextFloat();
                System.out.printf("%.2f\n", calc.calculateArea(radius));
            }

            if (sc.hasNextFloat()) {
                float length = sc.nextFloat();
                float breadth = sc.nextFloat();
                System.out.printf("%.2f\n", calc.calculateArea(length, breadth));
            }

            if (sc.hasNextDouble()) {
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                System.out.printf("%.2f\n", calc.calculateArea(base, height));
            }
        }
    }
}
