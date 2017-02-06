import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _05LineNumbers {
    public static void main(String[] args){
        final String inputPath = "D:\\_05input.txt";
        final String outputPath = "D:\\_05output.txt";
        int counter = 1;

        try(BufferedReader reader = Files.newBufferedReader(Paths.get(inputPath));
            PrintWriter writer = new PrintWriter(outputPath)) {
            String line = reader.readLine();
            while (line != null){
                writer.println(counter + "." + "  " + line);
                counter++;
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
