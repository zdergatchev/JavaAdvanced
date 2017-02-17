import java.math.BigInteger;
import java.util.Scanner;

public class _08MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger firstNum = sc.nextBigInteger();
        BigInteger secondNum = sc.nextBigInteger();
        System.out.println(firstNum.multiply(secondNum));
    }
}
