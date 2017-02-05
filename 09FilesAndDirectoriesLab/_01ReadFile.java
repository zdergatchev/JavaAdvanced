import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class _01ReadFile {
    public static void main(String[] args) {
        String path = "D:\\_01input.txt";

        try (InputStream in = new FileInputStream(path)) {
            int oneByte = in.read();
            while (oneByte >= 0) {
                System.out.print(Integer.toBinaryString(oneByte) + " ");
                oneByte = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
