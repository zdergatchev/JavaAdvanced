import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class _07MergeTwoFiles {
    public static void main(String[] args){
        final String input1 = "D:\\_07input1.txt";
        final String input2 = "D:\\_07input2.txt";
        final String output = "D:\\_07output.txt";
        ArrayList<String> strings = new ArrayList<>();
        try(BufferedReader firstReader = Files.newBufferedReader(Paths.get(input1));
            BufferedReader secondReader = Files.newBufferedReader(Paths.get(input2));
            PrintWriter writer = new PrintWriter(output)) {
            String line = firstReader.readLine();
            while (line != null){
                strings.add(line);
                line = firstReader.readLine();
            }
            line = secondReader.readLine();
            while (line != null){
                strings.add(line);
                line = secondReader.readLine();
            }
            for (String string : strings) {
                writer.println(string);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
