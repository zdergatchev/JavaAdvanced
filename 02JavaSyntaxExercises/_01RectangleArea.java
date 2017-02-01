import java.util.Scanner;

public class _01RectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double height = input.nextDouble();
        double width = input.nextDouble();
        double area = height * width;
        System.out.printf("%.2f", area);
    }
}

