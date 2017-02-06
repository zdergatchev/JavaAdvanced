import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _02SumBytes {
    public static void main(String[] args){
        final String inputPath = "D:\\_02input.txt";
        try(BufferedReader reader = Files.newBufferedReader(Paths.get(inputPath))) {
            String line = reader.readLine();
            long sum = 0;
            while (line != null){
                for (int i = 0; i < line.length(); i++) {
                    sum += line.charAt(i);
                }
                line = reader.readLine();
            }
            System.out.println(sum);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
