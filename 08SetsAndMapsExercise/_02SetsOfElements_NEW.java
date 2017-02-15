import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _02SetsOfElements_NEW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] setsSize = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        for (int i = 0; i < setsSize[0] + setsSize[1]; i++) {
            if(i < setsSize[0]) {
                set1.add(Integer.parseInt(scan.nextLine()));
            } else {
                set2.add(Integer.parseInt(scan.nextLine()));
            }
        }
        set1.retainAll(set2);
        for(Integer number : set1){
            if (set2.contains(number)) {
                System.out.print(number + " ");
            }
        }
    }
}
