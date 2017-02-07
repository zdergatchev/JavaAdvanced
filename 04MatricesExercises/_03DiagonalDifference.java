import java.util.Scanner;

public class _03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dimension = scan.nextInt();
        int[][] matrix = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        //calculate sum of diagonal1
        int sumOfDiagonal1=0;
        for (int i = 0, j =0; i< dimension && j < dimension; i++, j++) {
            sumOfDiagonal1= sumOfDiagonal1 + matrix[i][j];
        }

        //calculate sum of diagonal2
        int sumOfDiagonal2=0;
        for (int i=0,j=dimension-1 ; i<dimension && j>=0 ; i++, j--) {
            sumOfDiagonal2= sumOfDiagonal2 + matrix[i][j];
        }

        System.out.println(Math.abs(sumOfDiagonal2 - sumOfDiagonal1));
    }
}
