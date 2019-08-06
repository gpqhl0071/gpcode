package com.example.pattern.structuralDesignPatterns.decoratorDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 11:11
 */
public class LuxuryCar extends CarDecorator {
  public LuxuryCar(Car c) {
    super(c);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.print(" Adding features of Luxury Car.");
  }
}
