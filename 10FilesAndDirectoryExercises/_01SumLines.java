import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _01SumLines {

    public static void main(String[] args){
        final String inputPath = "D:\\_01input.txt";
        try(BufferedReader reader = Files.newBufferedReader(Paths.get(inputPath))) {
            String line = reader.readLine();
            while (line != null){
                long sum = 0;
                for (int i = 0; i < line.length(); i++) {
                    sum += line.charAt(i);
                }

                System.out.println(sum);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
