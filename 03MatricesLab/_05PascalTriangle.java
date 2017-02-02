import java.util.Scanner;

public class _05PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = Integer.parseInt(scan.nextLine());

        long[][] pascal = new long[height][];

        for(int i = 0; i < height; i++){
            pascal[i] = new long[i + 1];
        }

        pascal[0][0] = 1;

        for(int row = 1; row < height; row++){
            pascal[row][0] = 1;
            pascal[row][pascal[row].length - 1] = 1;
            for(int col = 1; col < pascal[row].length - 1; col++){
                pascal[row][col] = pascal[row - 1][col - 1] + pascal[row - 1][col];
            }
        }

        for(long[] ints : pascal){
            for(long anInt : ints){
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
