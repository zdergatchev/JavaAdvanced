import java.util.Scanner;

public class _03FormattingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        String binaryStringA = Integer.toString(a, 2);
        while(binaryStringA.length() < 10){
            binaryStringA = "0" + binaryStringA;
        }
        if(binaryStringA.length() > 10){
            binaryStringA = binaryStringA.substring(0, 10);
        }
        System.out.println(String.format("|%-10X|%s|%10.2f|%-10.3f|", a, binaryStringA, b, c));
    }
}
