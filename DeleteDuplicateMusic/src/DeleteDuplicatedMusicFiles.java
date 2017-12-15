import java.io.File;
import java.lang.reflect.Array;
import java.util.*;

public class DeleteDuplicatedMusicFiles {

  public static final String[] musicType = {"", "", ".mp3", ".ape", ".flac",};
  public static final String[] operations = {
          "列出重复文件",  "列出所有mp3类型文件",
          "列出所有ape类型文件", "列出所有flac类型文件",
          "列出所有其它类型文件", "删除重复文件"
  };

  public static DeleteDuplicatedMusicFiles deleteDuplicatedMusicFiles;

  private HashSet<String> nameSet;
  private HashSet<String> duplicatedFiles;
  private HashSet<File> allFiles = new HashSet<File>();
  private HashMap<String, File> apeMusic;
  private HashMap<String, File> mp3Music;
  private HashMap<String, File> flacMusic;
  private HashMap<String, File> otherTypeMusic;

  private DeleteDuplicatedMusicFiles(String filePath) {
    initData();
    run(filePath);
  }

  public static DeleteDuplicatedMusicFiles getDeleteDuplicatedMusicFiles(String filePath) {
   return deleteDuplicatedMusicFiles == null ? new DeleteDuplicatedMusicFiles(filePath) :
           deleteDuplicatedMusicFiles;
  }

  public void initData() {
    this.nameSet = new HashSet<String>();
    this.duplicatedFiles = new HashSet<String>();
    this.apeMusic = new HashMap<String, File>();
    this.mp3Music = new HashMap<String, File>();
    this.flacMusic = new HashMap<String, File>();
    this.otherTypeMusic = new HashMap<String, File>();
  }

  public void run(String filePath){
    System.out.println("当前文件路径：" + filePath);
    System.out.println("请输入操作类型：" + Arrays.toString(operations));
    getFiles(filePath);
    Scanner scanner = new Scanner(System.in);
    int opt = scanner.nextInt();
    while (opt != 0) {
      if (opt == 1 || opt == 2 || opt ==3 || opt == 4 || opt == 5)
        listFiles(opt);
      if (opt == 6)
        delDuplFiles();
        opt = scanner.nextInt();
    }
  }

  /**
   * 获取当前目录下的所有文件
   * @param filePath 根目录
   * @return 如果根目录为空返回null, 否则返回文件列表
   */
  public static File[] getAllFiles(String filePath) {

    File rootFile = new File(filePath);

    if (!rootFile.exists()) {
      System.out.println(filePath + " File doesn't exit!");
      return null;
    }
    return rootFile.listFiles();
  }

  /**
   *
   * @param filePath
   */
  public void getFiles(String filePath) {

    File[] files = DeleteDuplicatedMusicFiles.getAllFiles(filePath);

    for (File file: files) {

      if (file.isDirectory()) continue;

      String fileName = file.getName();
      String musicName = fileName.substring(0, fileName.lastIndexOf('.'));

      if (nameSet.contains(musicName))
        duplicatedFiles.add(musicName);
      else
        nameSet.add(musicName);

      if (fileName.endsWith(".mp3"))
        mp3Music.put(musicName, file);
      else if (fileName.endsWith(".ape"))
        apeMusic.put(musicName, file);
      else if (fileName.endsWith(".flac"))
        flacMusic.put(musicName, file);
      else
        otherTypeMusic.put(musicName, file);
    }
    System.out.println();
  }

  public void listFiles(int type) {
    Set<String> nameSet = null;
    switch (type) {
      case 1:
        nameSet = duplicatedFiles;
        break;
      case 2:
        nameSet = mp3Music.keySet();
        break;
      case 3:
        nameSet = apeMusic.keySet();
        break;
      case 4:
        nameSet = flacMusic.keySet();
        break;
      case 5:
        nameSet = otherTypeMusic.keySet();
        break;
    }
    for (String set : nameSet)
      System.out.println(set + musicType[type]);
  }

  public void delDuplFiles() {
    for (String musicName : duplicatedFiles) {
      File mp3File = mp3Music.get(musicName);
      File apeFile = apeMusic.get(musicName);
      File flacFile = flacMusic.get(musicName);
      if (mp3File != null)
        deletFiles(mp3File);
      if (apeFile != null && flacFile != null)
        deletFiles(apeFile);
    }
  }

  public void deletFiles(File... files) {
    for (File file : files) {
      if (file != null) {
//        file.delete();
        System.out.println("删除文件：" + file.getName());
      }
    }
  }
}
