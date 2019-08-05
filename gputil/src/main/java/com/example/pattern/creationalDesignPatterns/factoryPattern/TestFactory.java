package com.example.pattern.creationalDesignPatterns.factoryPattern;

/**
 * @author gao peng
 * @date 2019/8/5 15:37
 */
public class TestFactory {

  public static void main(String[] args) {
    Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
    Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");
    System.out.println("Factory PC Config::" + pc);
    System.out.println("Factory Server Config::" + server);
  }
}
