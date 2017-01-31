import java.util.*;

public class _09CalculateTriangleAreaMethod {
    static double calcTriangleArea(double width, double height) {
        return width * height / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width = input.nextDouble();
        double height = input.nextDouble();
        double area = calcTriangleArea(width, height);
        System.out.printf("Area = %.2f", area);
    }
}
