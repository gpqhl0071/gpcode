package com.example.pattern.creationalDesignPatterns.factoryPattern;

/**
 * @author gao peng
 * @date 2019/8/5 15:36
 */
public class ComputerFactory {

  public static Computer getComputer(String type, String ram, String hdd, String cpu) {
    if ("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
    else if ("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

    return null;
  }
}
