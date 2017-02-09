import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class _02SumNumbersNEW {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> input = Arrays.asList(reader.readLine().split(", "));
        List<Integer> numbers = new ArrayList<>();
        int sum = 0;


        Function<String, Integer> number = n -> Integer.parseInt(n);
        Function<Integer, Integer> numsSums = n -> n;

        for (String s : input) {
            numbers.add(number.apply(s));
        }


        for (Integer integer : numbers) {
            sum += numsSums.apply(integer);
        }


        System.out.println("Count = " +numbers.size());
        System.out.println("Sum = " +sum);



    }

}
