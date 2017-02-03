import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _07PalindromeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palindromeCandidate = scan.nextLine();
        Deque<Character> queue = new ArrayDeque<>();
        for (char c : palindromeCandidate.toCharArray()){
            queue.offer(c);
        }
        boolean isPalindrome = true;
        while (queue.size() > 1) {
            char first = queue.poll();
            char last = queue.pollLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
