import java.util.ArrayList;
import java.util.Scanner;

public class _04GroupNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        matrix.add(0, new ArrayList<>());
        matrix.add(1, new ArrayList<>());
        matrix.add(2, new ArrayList<>());

        for(String s : input){
            int currentNumber = Integer.parseInt(s);
            matrix.get(Math.abs(currentNumber % 3)).add(currentNumber);
        }

        for(ArrayList<Integer> integers : matrix){
            for(Integer integer : integers){
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
