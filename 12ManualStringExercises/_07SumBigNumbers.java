import java.math.BigInteger;
import java.util.Scanner;

public class _07SumBigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger firstNum = sc.nextBigInteger();
        BigInteger secondNum = sc.nextBigInteger();
        System.out.println(firstNum.add(secondNum));
    }
}

//http://stackoverflow.com/questions/3748846/how-to-add-two-numbers-of-any-length-in-java