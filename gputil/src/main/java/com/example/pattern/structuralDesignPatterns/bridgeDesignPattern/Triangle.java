package com.example.pattern.structuralDesignPatterns.bridgeDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 10:37
 */
public class Triangle extends Shape {
  public Triangle(Color c) {
    super(c);
  }

  @Override
  public void applyColor() {
    System.out.print("Triangle filled with color ");
    color.applyColor();
  }
}
