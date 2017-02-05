import java.io.*;

public class _05WriteEveryThirdLine {
    public static void main(String[] args) {
        String inputPath = "D:\\_05input.txt";
        String outputPath = "D:\\_05output.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            String line = reader.readLine();
            int counter = 1;
            while (line != null) {
                if (counter % 3 == 0) {
                    writer.println(line);
                }
                line = reader.readLine();
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
