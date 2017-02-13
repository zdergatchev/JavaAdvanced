import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _09RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());
        List<Long> fibonacci = new ArrayList<>();
        long fibonacciToReturn = 0;
        fibonacci.add((long) 1);
        fibonacci.add((long) 1);

        for (int i = 2; i <= num; i++) {
            fibonacciToReturn = fibonacci.get(i - 1) + fibonacci.get(i - 2);
            fibonacci.add(fibonacciToReturn);
        }
        System.out.println(fibonacciToReturn);
    }
}
