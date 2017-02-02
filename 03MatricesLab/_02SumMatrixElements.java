import java.util.Scanner;

public class _02SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        int[][] numbers = new int[Integer.parseInt(input[0])]
                [Integer.parseInt(input[1])];
        for (int row = 0; row < numbers.length; row++) {
            String[] remainder = scan.nextLine().split(", ");
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = Integer.parseInt(remainder[col]);
            }
        }
        System.out.println(numbers.length);
        System.out.println(numbers[0].length);

        int sum = 0;
        for(int[] number : numbers){
            for(int i : number){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

