package com.example.pattern.behavioralDesignPatterns.commandDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 14:35
 */
public class FileInvoker {
  public Command command;

  public FileInvoker(Command c) {
    this.command = c;
  }

  public void execute() {
    this.command.execute();
  }
}
