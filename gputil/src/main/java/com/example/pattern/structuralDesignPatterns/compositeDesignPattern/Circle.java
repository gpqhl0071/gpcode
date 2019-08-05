package com.example.pattern.structuralDesignPatterns.compositeDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/5 17:30
 */
public class Circle implements Shape {

  @Override
  public void draw(String fillColor) {
    System.out.println("Drawing Circle with color " + fillColor);
  }

}
