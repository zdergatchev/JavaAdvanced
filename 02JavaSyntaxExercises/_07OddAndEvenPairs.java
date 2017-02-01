import java.util.Scanner;

public class _07OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputs = scan.nextLine().split(" ");
        if (inputs.length % 2 == 1) {
            System.out.println("invalid length");
            return;
        }
        for (int i = 0; i < inputs.length; i += 2) {
            int numOne = Integer.parseInt(inputs[i]);
            int numTwo = Integer.parseInt(inputs[i + 1]);

            if (numOne % 2 == 0 && numTwo % 2 == 0)
                System.out.printf("%d, %d -> both are even\n", numOne, numTwo);
            else if (numOne % 2 == 1 && numTwo % 2 == 1)
                System.out.printf("%d, %d -> both are odd\n", numOne, numTwo);
            else
                System.out.printf("%d, %d -> different\n", numOne, numTwo);
        }
    }
}
