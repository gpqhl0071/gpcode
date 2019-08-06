package com.example.pattern.behavioralDesignPatterns.commandDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 14:34
 */
public class OpenFileCommand implements Command {
  private FileSystemReceiver fileSystem;

  public OpenFileCommand(FileSystemReceiver fs) {
    this.fileSystem = fs;
  }

  @Override
  public void execute() {
    //open command is forwarding request to openFile method
    this.fileSystem.openFile();
  }

}
