import java.util.*;
import java.math.BigInteger;

public class _07ProductOfNumbersNM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int number = n;
        BigInteger product = BigInteger.ONE;
        do {
            BigInteger numberBig = new BigInteger("" + number);
            product = product.multiply(numberBig);
            number++;;
        }
        while (number <= m);
        System.out.printf("product[%d..%d] = %d\n", n, m, product);
    }
}
