import java.util.ArrayDeque;
import java.util.Scanner;

public class _04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String expression = scan.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int index = 0; index < expression.length(); index++){
            char symbol = expression.charAt(index);
            if(symbol == '('){
                stack.push(index);
            } else if (symbol == ')'){
                int startIndex = stack.pop();
                String sub = expression.substring(startIndex, index + 1);
                System.out.println(sub);
            }
        }
    }
}
