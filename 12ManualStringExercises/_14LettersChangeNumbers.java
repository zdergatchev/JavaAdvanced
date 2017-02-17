import java.util.*;

public class _14LettersChangeNumbers {
    public static void main(String[] args){
        String[] items = new Scanner(System.in).nextLine().split("\\s+");
        double sum = 0;
        for(String item : items){
            char firstLetter = item.charAt(0);
            char lastLetter = item.charAt(item.length() - 1);
            int firstLetterPosition = (int)firstLetter % 32;
            int lastLetterPosition = (int)lastLetter % 32;
            double number = Double.parseDouble(item.substring(1, item.length() - 1));
            if (Character.isUpperCase(firstLetter)) {
                number /= firstLetterPosition;
            } else {
                number *= firstLetterPosition;
            }
            if (Character.isUpperCase(lastLetter)) {
                number -= lastLetterPosition;
            } else {
                number += lastLetterPosition;
            }
            sum += number;
        }
        System.out.printf("%.2f", sum);
    }
}
