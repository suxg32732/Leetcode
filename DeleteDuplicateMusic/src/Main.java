import java.io.File;
import java.util.HashMap;

public class Main {

    public static String resPath = "d:"+ File.separator + "MyMusic" + File.separator + "Music";
    public static String desPath = "d:"+ File.separator + "MyMusic" + File.separator + "test";

    public static String testPath = "d:"+ File.separator + "test";

    public static void main(String[] args) {
//        DeleteDuplicatedMusicFiles.getDeleteDuplicatedMusicFiles(resPath);
        DeleteDuplicatedMusicFiles.getDeleteDuplicatedMusicFiles(testPath);
    }


}
