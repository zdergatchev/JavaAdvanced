import java.util.Scanner;

public class _10FirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().trim().split("\\s");
        String[] command = scanner.nextLine().trim().split("\\s");
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = Integer.parseInt(nums[i]);
        }

        int numElements = Integer.parseInt(command[1]);
        String oddEven = command[2];

        if(oddEven.toLowerCase().equals("odd")) {
            printElements(array, numElements, 1);
        } else {
            printElements(array, numElements, 0);
        }
    }

    private static void printElements(int[] array, int numElements, int type) {
        for (int i = 0; i < array.length; i++) {
            if(numElements == 0) {
                break;
            }

            if(array[i] % 2 == type) {
                numElements--;
                System.out.print(array[i] + " ");
            }
        }
    }
}
