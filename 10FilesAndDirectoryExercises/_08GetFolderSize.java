import java.io.File;
import java.util.ArrayDeque;

public class _08GetFolderSize {
    public static void main(String[] args) {
        String pathname = "D:\\Users";
        File file = new File(pathname);
        ArrayDeque<File> files = new ArrayDeque<>();
        files.offer(file);
        long bytes = 0;

        while (!files.isEmpty()){
            File current = files.poll();
            for (File file1 : current.listFiles()) {
                if(file1.isDirectory()){
                    files.offer(file1);
                } else {
                    bytes += file1.length();
                }
            }
        }
        System.out.println("Folder size: " + bytes);
    }
}
