import java.util.ArrayDeque;
import java.util.Scanner;

// by video
public class _03MaximumElementNEW1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int commandsCount = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> someNumbers = new ArrayDeque<>();
        ArrayDeque<Integer> maxNumbers = new ArrayDeque<>();

        int maxValue = Integer.MIN_VALUE;

        for(int i = 0; i < commandsCount; i++){
            String[] commands = scan.nextLine().split(" ");
            int command = Integer.parseInt(commands[0]);
            switch(command){
                case 1:
                    int number = Integer.parseInt(commands[1]);
                    if(number >= maxValue){
                        maxValue = number;
                        maxNumbers.push(maxValue);
                    }
                    someNumbers.push(number);
                    break;
                case 2:
                    int deletedItems = someNumbers.pop();
                    if(deletedItems == maxValue){
                        maxNumbers.pop();
                        if(!maxNumbers.isEmpty()){
                            maxValue = maxNumbers.peek();
                        } else {
                            maxValue = Integer.MIN_VALUE;
                        }
                    }
                    break;
                case 3:
                    System.out.println(maxNumbers.peek());
                    break;
            }
        }
    }
}
