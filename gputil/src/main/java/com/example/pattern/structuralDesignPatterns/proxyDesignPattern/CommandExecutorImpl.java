package com.example.pattern.structuralDesignPatterns.proxyDesignPattern;

import java.io.IOException;

/**
 * @author gao peng
 * @date 2019/8/5 17:34
 */
public class CommandExecutorImpl implements CommandExecutor {
  @Override
  public void runCommand(String cmd) throws IOException {
    //some heavy implementation
    Runtime.getRuntime().exec(cmd);
    System.out.println("'" + cmd + "' command executed.");
  }
}
