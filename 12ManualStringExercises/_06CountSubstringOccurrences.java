import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _06CountSubstringOccurrences {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String input = read.readLine().toLowerCase();
        String searchString = read.readLine().toLowerCase();
        int counter = 0;
        int index = 0;
        while ((index = input.indexOf(searchString, index)) != -1) {
            index++;
            counter++;
        }
        System.out.println(counter);
    }
}
