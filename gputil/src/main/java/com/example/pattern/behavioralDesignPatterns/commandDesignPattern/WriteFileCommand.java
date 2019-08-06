package com.example.pattern.behavioralDesignPatterns.commandDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 14:35
 */
public class WriteFileCommand implements Command {
  private FileSystemReceiver fileSystem;

  public WriteFileCommand(FileSystemReceiver fs) {
    this.fileSystem = fs;
  }

  @Override
  public void execute() {
    this.fileSystem.writeFile();
  }

}
