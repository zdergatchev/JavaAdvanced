import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _12CharacterMultiplier {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] input = scan.readLine().split("\\s+");
        String first = input[0];
        String second = input[1];
        int result = charMultiplier(first, second);
        System.out.println(result);
    }

    private static int charMultiplier(String first, String second){
        int result = 0;
        int length = Math.min(first.length(), second.length());
        for (int i = 0; i < length; i++) {
            result += first.charAt(i) * second.charAt(i);
        }
        while (length < first.length()){
            result += first.charAt(length);
            length++;
        }
        while (length < second.length()){
            result += second.charAt(length);
            length++;
        }
        return result;
    }
}
