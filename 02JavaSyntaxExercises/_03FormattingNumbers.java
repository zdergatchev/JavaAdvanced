import java.util.Scanner;

public class _03FormattingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] input = scan.nextLine().split("[\\t\\s ]+");
        int firstNumber = Integer.parseInt(input[0]);
        double secondNumber = Double.parseDouble(input[1]);
        double thirdNumber = Double.parseDouble(input[2]);
        String aBinary = Integer.toString(firstNumber, 2);
        if(aBinary.length()>10){
            aBinary =aBinary.substring(0,10);
        }
        System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|", firstNumber, Integer.parseInt(aBinary), secondNumber, thirdNumber);
    }
}
