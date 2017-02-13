import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _12InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] expression = scanner.nextLine().split(" ");

        Deque<String> numbersQueue = new ArrayDeque<>();
        Deque<String> operatorStack = new ArrayDeque<>();

        for(String token : expression){
            if(isNumeric(token)){
                numbersQueue.add(token);
            } else{
                if(operatorStack.size() == 0) {
                    operatorStack.push(token);
                } else {
                    if(token.equals(")")){
                        String last = operatorStack.pop();
                        while (!last.equals("(")) {
                            numbersQueue.add(last);
                            last = operatorStack.pop();
                        }
                    } else if(isCurrentPrior(token, operatorStack.peek())){
                        operatorStack.push(token);
                    } else {
                        numbersQueue.add(operatorStack.pop());
                        operatorStack.push(token);
                    }
                }
            }
        }
        while (operatorStack.size() > 0){
            numbersQueue.add(operatorStack.pop());
        }
        while (numbersQueue.size() > 0){
            System.out.print(numbersQueue.pop() + " ");
        }
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static boolean isCurrentPrior(String current, String prev) {
        switch (current){
            case "-":
            case "+":
                if(prev.equals("(") )
                    return true;
                return false;
            case "*":
            case "/":
                if(prev.equals("-") || prev.equals("+") || prev.equals("("))
                    return true;
                return false;
            case "^":
            case "(":
                return true;
        }
        return true;
    }
}
