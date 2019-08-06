package com.example.pattern.structuralDesignPatterns.bridgeDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 10:38
 */
public class BridgePatternTest {

  public static void main(String[] args) {
    Shape tri = new Triangle(new RedColor());
    tri.applyColor();

    Shape pent = new Pentagon(new GreenColor());
    pent.applyColor();
  }
}
