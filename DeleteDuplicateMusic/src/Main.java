import java.io.File;
import java.util.HashMap;

public class Main {

    public static String resPath = "d:"+ File.separator + "MyMusic" + File.separator + "Music";
    public static String desPath = "d:"+ File.separator + "MyMusic" + File.separator + "test";

    public static void main(String[] args) {
        HashMap<String, File> nameMap = new HashMap<String, File>();

        getAllFileNames(resPath);
    }

    public static  void getAllFileNames(String filePath) {
        File[] files = new File(filePath).listFiles();
        HashMap<String, File> nameMap = new HashMap<String, File>();

        for (File file: files) {

            if (file.isDirectory())
                continue;
            String fileName = file.getName();
            String musicName = fileName.substring(0, fileName.lastIndexOf('.'));

            if (nameMap.containsKey(musicName)) {
                File tmp = delDuplFiles(nameMap.get(musicName), file, musicName);
                if (!tmp.equals(file))
                    nameMap.put(musicName, file);
            } else
                nameMap.put(musicName, file);
        }
    }

    public static File delDuplFiles(File file1, File file2, String fileName) {
        File delFile = null;

        int file1Index = file1.getName().lastIndexOf('.');
        String type1 = file1.getName().substring(file1Index + 1);

        int file2Index = file2.getName().lastIndexOf('.');
        String type2 = file2.getName().substring(file2Index + 1);

        if (type1.equals(type2)) {
            delFile = file1.length() > file2.length() ? file2 : file1;
        } else {
            if (type1.equals("mp3") || type2.equals("mp3"))
                delFile = type1.equals("mp3") ? file1 : file2;
            else if (type1.equals("ape") || type2.equals("ape"))
                delFile = file1.length() > file2.length() ? file2 : file1;
        }

//        delFile.delete();
        System.out.println("删除文件：" + delFile.getName());
        return delFile;
    }
}
