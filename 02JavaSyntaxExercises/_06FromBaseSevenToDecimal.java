import java.util.Scanner;

public class _06FromBaseSevenToDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String base7Number = console.next();
        Integer decimalNumber = Integer.valueOf(base7Number, 7);
        System.out.println(decimalNumber);
    }
}
