package com.example.pattern.behavioralDesignPatterns.commandDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 14:36
 */
public class FileSystemReceiverUtil {
  public static FileSystemReceiver getUnderlyingFileSystem() {
    String osName = System.getProperty("os.name");
    System.out.println("Underlying OS is:" + osName);
    if (osName.contains("Windows")) {
      return new WindowsFileSystemReceiver();
    } else {
      return new UnixFileSystemReceiver();
    }
  }
}
