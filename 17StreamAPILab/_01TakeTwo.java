import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01TakeTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputs = Arrays.asList(reader.readLine().split("\\s+"));
        List<Integer> numbers = new ArrayList<>();
        for(String input : inputs){
            numbers.add(Integer.valueOf(input));
        }
        numbers.stream()
                .filter(n -> 10 <= n && n <= 20)
                .distinct()
                .limit(2)
                .forEach(n -> System.out.print(n + " "));
    }
}
