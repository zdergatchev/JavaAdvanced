import java.util.Scanner;

public class _08HitTheTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        for(int i = 1; i <= 20; i++){
            for(int j = 1; j <= 20; j++){
                if(i + j == limit){
                    System.out.printf("%d + %d = %d",i,j,limit);
                    System.out.println();
                }
                else if(i - j == limit){
                    System.out.printf("%d - %d = %d",i,j,limit);
                    System.out.println();
                }
            }
        }
    }
}
