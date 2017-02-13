import java.util.ArrayDeque;
import java.util.Scanner;

//by video
public class _08BalancedParenthesisNEW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] braces = sc.nextLine().toCharArray();
        if(braces.length % 2 != 0){
            System.out.println("NO");
            return;
        }
        ArrayDeque<Character> openBraces = new ArrayDeque<>();
        boolean isBalanced = true;
        for (char brace : braces) {
            if(brace == '{' || brace == '[' || brace == '('){
                openBraces.push(brace);
            } else {
                char currentBrace = openBraces.pop();
                if(brace == '}'){
                    brace = '{';
                }
                if(brace == ']'){
                    brace = '[';
                }
                if(brace == ')'){
                    brace = '(';
                }
                if(brace != currentBrace){
                    System.out.println("NO");
                    isBalanced = false;
                    break;
                }
            }
        }
        if(isBalanced){
            System.out.println("YES");
        }
    }
}

