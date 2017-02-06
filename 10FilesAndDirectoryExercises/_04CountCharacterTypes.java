import java.io.*;
import java.util.Collections;
import java.util.HashSet;

public class _04CountCharacterTypes {
    public static void main(String[] args) {
        final String inputPath = "D:\\_04input.txt";
        final String outputPath = "D:\\_04output.txt";
        HashSet<Character> punctoation = new HashSet<>();
        Collections.addAll(punctoation, '!', '.', ',', '?');
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintWriter writer = new PrintWriter(new FileOutputStream(outputPath))) {
            int vowels = 0;
            int consonants = 0;
            int punctuation = 0;

            String line = reader.readLine();
            while (line != null) {
                for (char c : line.toCharArray()) {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vowels++;
                    } else if (punctoation.contains(c)) {
                        punctuation++;
                    } else if (c != ' ') {
                        consonants++;
                    }
                }
                writer.println("Vowels: " + vowels);
                writer.println("Consonants: " + consonants);
                writer.println("Punctuation: " + punctuation);
                line = reader.readLine();
            }
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Punctuation: " + punctuation);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
