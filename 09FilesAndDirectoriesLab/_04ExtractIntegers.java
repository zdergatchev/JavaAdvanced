import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class _04ExtractIntegers {
    public static void main(String[] args) {
        String inputPath = "D:\\_04input.txt";
        String outputPath = "D:\\_04output.txt";
        try (Scanner scanner = new Scanner(new FileInputStream(inputPath));
             PrintWriter writer = new PrintWriter(outputPath)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    writer.println(scanner.nextInt());
                }
                scanner.next();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

