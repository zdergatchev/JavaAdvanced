import java.io.*;

public class _09CopyAPicture {
    public static void main(String[] args) {
        try(InputStream source = new FileInputStream(new File("D:\\_09source.jpg"));
            OutputStream copy = new FileOutputStream(new File("D:\\_09copy.jpg"));){
            byte[] buffer = new byte[1024];
            int length;
            while ((length = source.read(buffer)) > 0) {
                copy.write(buffer, 0, length);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
