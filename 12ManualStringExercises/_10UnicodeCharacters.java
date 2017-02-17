import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10UnicodeCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        for (char c : input.toCharArray()) {
            System.out.print(String.format("\\u%04x", (int) c));
        }
    }
}


