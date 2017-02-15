
import java.util.Scanner;
import java.util.TreeMap;

public class _04CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] input = scan.nextLine().toCharArray();
        TreeMap<Character, Integer> counter  = new TreeMap<>();

        for (int i = 0; i < input.length; i++) {
            int count = 1;
            if (counter.containsKey(input[i])) {
                count += counter.get(input[i]);
                counter.put(input[i], count);
            } else {
                counter.put(input[i], count);
            }
        }

        for (Character ch : counter.keySet()) {
            System.out.println(ch + ":" + " " + counter.get(ch) + " " + "time/s");
        }
    }
}
