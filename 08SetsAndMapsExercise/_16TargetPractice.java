import java.util.*;

public class _16TargetPractice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] dimensions = scan.nextLine().split(" ");
        int rows  = Integer.parseInt(dimensions[0]);
        int cols  = Integer.parseInt(dimensions[1]);
        String snake = scan.nextLine();
        String[] commands = scan.nextLine().split(" ");
        int rowShot = Integer.parseInt(commands[0]);
        int colsShot = Integer.parseInt(commands[1]);
        int radiusDamage = Integer.parseInt(commands[2]);
        char[][] matrix = new char[rows][cols];
        char[] snakechars = snake.toCharArray();

        int counter = 1;
        int s = 0;
        for(int i = rows - 1; i >= 0; i--){
            if(counter % 2 != 0){
                for(int j = cols - 1; j >= 0; j--){
                    matrix[i][j] = snakechars[s];
                    if(s == snakechars.length - 1){
                        s = -1;
                    }
                    s++;
                }
                counter++;
            } else if(counter % 2 == 0){
                for(int j = 0; j < cols; j++){
                    matrix[i][j] = snakechars[s];
                    if(s == snakechars.length - 1){
                        s = -1;
                    }
                    s++;
                }
                counter++;
            }
        }

        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if((row - rowShot) * (row - rowShot) + (col - colsShot) *
                        (col - colsShot) <= radiusDamage * radiusDamage){
                    matrix[row][col] = ' ';
                }
            }
        }

        if(rows > 1){
            for(int col = 0; col < cols; col++){
                boolean isFalling = true;
                while(isFalling){
                    boolean swap = false;
                    for(int row = rows - 1; row > 0; row--){
                        if(matrix[row][col] == ' ' && matrix[row - 1][col] != ' '){
                            char temp = matrix[row][col];
                            matrix[row][col] = matrix[row - 1][col];
                            matrix[row - 1][col] = temp;
                            swap = true;
                            isFalling = true;
                        } else if(!swap) {
                            isFalling = false;

                        }
                    }
                }
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
