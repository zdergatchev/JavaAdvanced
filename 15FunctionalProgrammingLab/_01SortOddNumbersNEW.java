import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01SortOddNumbersNEW {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        List<String> input = Arrays.asList(reader.readLine().split(", "));
        List<Integer> numbers = new ArrayList<>();

        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }
        numbers.removeIf(n -> n % 2 != 0);
        for (Integer s : numbers) {
            sb.append(s);
            sb.append(", ");
        }

        sb.delete(sb.length() - 2, sb.length());
        System.out.println(sb);
        numbers.sort((a, b) -> a.compareTo(b));

        sb = new StringBuilder();
        for (Integer number : numbers) {
            sb.append(number);
            sb.append(", ");
        }

        sb.delete(sb.length() - 2, sb.length());
        System.out.println(sb);
    }
}
