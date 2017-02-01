import java.util.Scanner;

public class _05FromDecimalToBaseSeven {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int decimalNumber = console.nextInt();
        String base7Number = Integer.toString(decimalNumber, 7);
        System.out.println(base7Number);
    }
}
