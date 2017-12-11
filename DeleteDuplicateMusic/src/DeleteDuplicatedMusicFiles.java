import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DeleteDuplicatedMusicFiles {

  public static final String[] musicType = {".mp3", ".ape", ".flac",};

  private HashSet<String> nameSet;
  private HashSet<String> duplicatedFiles;
  private HashMap<String, File> apeMusic;
  private HashMap<String, File> mp3Music;
  private HashMap<String, File> flacMusic;
  private HashMap<String, File> otherTypeMusic;

  public DeleteDuplicatedMusicFiles(String filePath) {
    initData();
    run(filePath);
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
    String endFlag = "";
    System.out.println("请输入操作类型：");
    getFiles(filePath);
    while (!endFlag.equals("e")) {
      Scanner scanner = new Scanner(System.in);
      scanner.
    }
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

      if (fileName.endsWith("\\.mp3"))
        mp3Music.put(musicName, file);
      else if (fileName.endsWith("\\.ape"))
        apeMusic.put(musicName, file);
      else if (fileName.endsWith("\\.flac"))
        flacMusic.put(musicName, file);
      else
        otherTypeMusic.put(musicName, file);
    }

  }

  public void listFiles(int type) {
    Set<String> nameSet = null;
    switch (type) {
      case 1 :
        nameSet = mp3Music.keySet();
      case 2:
        nameSet = apeMusic.keySet();
      case 3:
        nameSet = flacMusic.keySet();
    }
    for (String set : nameSet)
      System.out.println(set + musicType[type]);
  }

  public void delDuplFiles() {
    for (String musicName : duplicatedFiles) {
      File mp3File = mp3Music.get(musicName);
      File apeFile = apeMusic.get(musicName);
      File flacFile = flacMusic.get(musicName);
      if (mp3Music.get(musicName) != null)
        deletFiles(mp3File, apeFile);
       else
        deletFiles(mp3File);
    }
  }

  public void deletFiles(File... files) {
    for (File file : files) {
      if (file != null) {
        file.delete();
        System.out.println("删除文件：" + file.getName());
      }
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
}
