import java.io.File;

public class _07ListFiles {
    public static void main(String[] args) {
        final String stringPath = "D:\\test";
        File file = new File(stringPath);

        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    if (!f.isDirectory()) {
                        System.out.printf("%s: %s\n", f.getName(), f.length());
                    }
                }
            }
        }
    }
}
