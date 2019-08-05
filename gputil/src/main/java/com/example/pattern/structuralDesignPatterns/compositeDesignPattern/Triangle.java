package com.example.pattern.structuralDesignPatterns.compositeDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/5 17:29
 */
public class Triangle implements Shape {
  @Override
  public void draw(String fillColor) {
    System.out.println("Drawing Triangle with color " + fillColor);
  }
}
