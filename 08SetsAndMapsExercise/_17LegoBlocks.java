import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class _17LegoBlocks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());
        String[][] first = new String[rows][];
        String[][] second = new String[rows][];
        int counter = 0;

        for (int i = 0; i < rows; i++) {
            first[i] = scan.nextLine().trim().split(" +");
            counter += first[i].length;
        }

        for (int i = 0; i < rows; i++) {
            second[i] = scan.nextLine().trim().split(" +");
            counter += second[i].length;
        }

        boolean found = false;
        int combinedWidth = first[0].length + second[0].length;
        for (int i = 1; i < second.length; i++) {
            int reverse = first[i].length + second[i].length;
            if(reverse != combinedWidth){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("The total number of cells is: " + counter);
        } else {
            for (int i = 0; i < first.length; i++) {
                String[] arr1 = first[i];
                List<String> arr2 = Arrays.asList(second[i]);
                Collections.reverse(arr2);
                String[] both = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2.toArray())).toArray(String[]::new);
                System.out.println(Arrays.toString(both));
            }
        }
    }
}


