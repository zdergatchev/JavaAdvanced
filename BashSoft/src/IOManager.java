import java.io.File;
import java.util.LinkedList;

public class IOManager {

    public static void traverseDirectory(int depth){
        LinkedList<File> subFolders = new LinkedList<File>();

        String path = SessionData.currentPath;
        int initialIndentation = path.split("\\\\").length;

        File root = new File(path);
        subFolders.add(root);

        try {
            while (subFolders.size() != 0){
                File currentFolder = subFolders.removeFirst();
                int currentIndentation = currentFolder.toString().split("\\\\").length - initialIndentation;

                if (depth - currentIndentation < 0) {
                    break;
                }

                OutputWriter.writeMessageOnNewLine(currentFolder.toString());

                if(currentFolder.listFiles() != null){
                    for(File file : currentFolder.listFiles()){
                        if(file.isDirectory()){

                            subFolders.add(file);
                        }else {
                            int indexOfLastSlash = file.toString().lastIndexOf("\\");
                            for (int i = 0; i < indexOfLastSlash; i++) {
                                OutputWriter.writeMessage("-");
                            }

                            OutputWriter.writeMessageOnNewLine(file.getName());
                        }
                    }
                }
            }
        } catch (Exception e){
            System.out.println("Access denied");
        }
    }

    public static void createDirectoryInCurrentFolder(String name) {
        String path = getCurrentDirectoryPath() + "\\" + name;
        File file = new File(path);
        file.mkdir();

    }

    public static String getCurrentDirectoryPath(){
        String currentPath = SessionData.currentPath;
        return currentPath;
    }

    public static void changeCurrentDirRelativePath(String relativePath) {
        if (relativePath.equals("..")) {

            String currentPath = getCurrentDirectoryPath();
            int indexOfLastSlash = currentPath.lastIndexOf("\\");
            String newPath = currentPath.substring(0, indexOfLastSlash);
            SessionData.currentPath = newPath;

        } else {
            String currentPath = getCurrentDirectoryPath();
            currentPath += "\\" + relativePath;
            changeCurrentDirAbsolutePath(currentPath);
        }
    }

    public static void changeCurrentDirAbsolutePath(String absolutePath) {
        File file = new File(absolutePath);
        if (!file.exists()) {
            OutputWriter.displayException(ExceptionMessages.INVALID_PATH);
            return;
        }

        SessionData.currentPath = absolutePath;
    }
}
