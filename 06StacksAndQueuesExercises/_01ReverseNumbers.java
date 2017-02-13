import java.util.ArrayDeque;
import java.util.Scanner;

public class _01ReverseNumbers{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");;
        ArrayDeque<String> reversed = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            reversed.addFirst(input[i]);
        }

        for (String num : reversed) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

