import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashSet;

import static java.lang.System.in;

public class _02WriteFile {
    public static void main(String[] args) {
        String inputPath = "D:\\_02input.txt";
        String outputPath = "D:\\_02output.txt";

        HashSet<Character> punctoation = new HashSet<>();
        Collections.addAll(punctoation, '.', ',', '!', '?');
        try (InputStream fis = new FileInputStream(inputPath);
             FileOutputStream fos = new FileOutputStream(outputPath)) {
            int oneByte = fis.read();
            while (oneByte >= 0) {
                if(!punctoation.contains((char)oneByte)){
                   fos.write(oneByte);
                }
                oneByte = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
