package com.example.pattern.structuralDesignPatterns.proxyDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/5 17:34
 */
public interface CommandExecutor {

  public void runCommand(String cmd) throws Exception;
}
