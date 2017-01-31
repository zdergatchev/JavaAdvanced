import java.util.*;

public class _02AverageOfThreeNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        double third = sc.nextDouble();
        double sumAbs = first + second + third;
        double avg = sumAbs / 3;
        System.out.printf("%.2f", avg);
    }
}
