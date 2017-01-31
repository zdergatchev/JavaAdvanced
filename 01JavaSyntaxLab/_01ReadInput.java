import java.util.*;

public class _01ReadInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstWord = input.next("\\w+");
        String secondWord = input.next("\\w+");
        int firstInt = input.nextInt();
        int secondInt = input.nextInt();
        int thirdInt = input.nextInt();
        input.nextLine();
        String thirdWord = input.nextLine();
        int sum = firstInt + secondInt + thirdInt;
        System.out.println(firstWord + " " + secondWord + " " + thirdWord + " " + sum);
    }
}
