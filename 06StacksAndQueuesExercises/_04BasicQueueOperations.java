
import java.util.ArrayDeque;
import java.util.Scanner;

public class _04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> integerQueue = new ArrayDeque<>();
        String[] input = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        for (int i = 0; i < n; i++) {
            integerQueue.add(sc.nextInt());
        }

        for (int i = 0; i < s; i++) {
            integerQueue.poll();
        }

        if (integerQueue.contains(x)){
            System.out.println("true");
        }else if (integerQueue.isEmpty()){
            System.out.println(0);
        }else {
            int min = Integer.MAX_VALUE;
            while (!integerQueue.isEmpty()){
                if (integerQueue.peek() < min){
                    min = integerQueue.peek();
                }else {
                    integerQueue.remove();
                }
            }
            System.out.println(min);
        }
    }
}
