import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;

public class _05MinEvenNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Optional<Double> tokens = Arrays.stream(reader.readLine().split("\\s+"))
                .filter(x -> !x.isEmpty())
                .map(x -> Double.parseDouble(x))
                .filter(n -> n % 2 == 0)
                .min(Double::compare);

        if (tokens.isPresent()) {
            System.out.printf("%.2f", tokens.get());
        }
        else {
            System.out.println("No match");
        }
    }
}
