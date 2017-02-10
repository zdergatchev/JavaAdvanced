import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.DoubleStream;

public class _04AverageOfDoubles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> tokens = Arrays.asList(reader.readLine().split("\\s+"));
        DoubleStream stream = tokens.stream()
                .filter(x -> !x.isEmpty())
                .mapToDouble(s -> Double.valueOf(s));

        OptionalDouble result = stream.average();

        if (result.isPresent()) {
            System.out.printf("%.2f", result.getAsDouble());
        } else {
            System.out.println("No match");
        }
    }
}
