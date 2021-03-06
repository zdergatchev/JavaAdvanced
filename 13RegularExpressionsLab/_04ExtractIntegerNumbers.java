import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _04ExtractIntegerNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
        System.out.println(matcher.group());
        }
    }
}
