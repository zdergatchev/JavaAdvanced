import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _09TextFilter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] censoredStrings = reader.readLine().split(", ");
        String text = reader.readLine();
        for (String word : censoredStrings) {
            StringBuilder censored = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                censored.append("*");
            }
            text = text.replaceAll(word, censored.toString());
        }
        System.out.println(text);
    }
}
