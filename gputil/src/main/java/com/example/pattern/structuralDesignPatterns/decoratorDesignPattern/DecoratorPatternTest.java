package com.example.pattern.structuralDesignPatterns.decoratorDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 11:11
 */
public class DecoratorPatternTest {
  public static void main(String[] args) {
    Car sportsCar = new SportsCar(new BasicCar());
    sportsCar.assemble();
    System.out.println("\n*****");

    Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
    sportsLuxuryCar.assemble();
  }
}
