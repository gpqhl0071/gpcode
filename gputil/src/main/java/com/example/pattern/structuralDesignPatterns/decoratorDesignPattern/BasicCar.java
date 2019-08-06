package com.example.pattern.structuralDesignPatterns.decoratorDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 11:09
 */
public class BasicCar implements Car {
  @Override
  public void assemble() {
    System.out.print("Basic Car.");
  }
}
