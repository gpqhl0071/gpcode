package com.example.pattern.behavioralDesignPatterns.commandDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 14:33
 */
public interface FileSystemReceiver {
  void openFile();

  void writeFile();

  void closeFile();
}
