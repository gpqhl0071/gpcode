package com.example.pattern.structuralDesignPatterns.bridgeDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 10:37
 */
public class Pentagon extends Shape {
  public Pentagon(Color c) {
    super(c);
  }

  @Override
  public void applyColor() {
    System.out.print("Pentagon filled with color ");
    color.applyColor();
  }
}
