package com.example.pattern.creationalDesignPatterns.abstractFactoryDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/5 15:46
 */
public class ComputerFactory {
  public static Computer getComputer(ComputerAbstractFactory factory) {
    return factory.createComputer();
  }
}
