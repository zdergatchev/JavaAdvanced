import java.util.LinkedHashSet;
import java.util.Scanner;

public class _03VoinaNumbergame {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedHashSet<Integer> firstPlayer = getPlayerNumbers();
        LinkedHashSet<Integer> secondPlayer = getPlayerNumbers();

        for (int i = 0; i < 50; i++) {
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()) {
                break;
            }
            int firstNumber = firstPlayer.iterator().next();
            firstPlayer.remove(firstNumber);
            int secondNumber = secondPlayer.iterator().next();
            secondPlayer.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstPlayer.add(firstNumber);
                firstPlayer.add(secondNumber);
            } else if (secondNumber > firstNumber) {
                secondPlayer.add(firstNumber);
                secondPlayer.add(secondNumber);
            } else {
                continue;
            }
        }

        if(firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");
        } else if (secondPlayer.size() > firstPlayer.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }

    private static LinkedHashSet<Integer> getPlayerNumbers () {
        LinkedHashSet<Integer> reminder = new LinkedHashSet<>();
        String line = scanner.nextLine();
        String[] input = line.split(" ");

        for (int i = 0; i < input.length; i++) {
            reminder.add(Integer.parseInt(input[i]));
        }
        return reminder;
    }
}
