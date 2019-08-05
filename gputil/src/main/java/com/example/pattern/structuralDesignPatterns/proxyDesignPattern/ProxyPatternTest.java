package com.example.pattern.structuralDesignPatterns.proxyDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/5 17:36
 */
public class ProxyPatternTest {

  public static void main(String[] args) {
    CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
    try {
      executor.runCommand("ls -ltr");
      executor.runCommand(" rm -rf abc.pdf");
    } catch (Exception e) {
      System.out.println("Exception Message::" + e.getMessage());
    }

  }

}
