import java.util.ArrayDeque;
import java.util.Scanner;

public class _01ReverseStrings {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        ArrayDeque<Character> reversed = new ArrayDeque<>();
        for (Character ch : input.toCharArray()) {
            reversed.push(ch);
        }

        while (!reversed.isEmpty()) {
            System.out.print(reversed.pop());
        }
    }
}
