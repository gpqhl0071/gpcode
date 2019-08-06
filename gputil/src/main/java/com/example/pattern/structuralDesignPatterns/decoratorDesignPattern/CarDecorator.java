package com.example.pattern.structuralDesignPatterns.decoratorDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 11:09
 */
public class CarDecorator implements Car {
  protected Car car;

  public CarDecorator(Car c) {
    this.car = c;
  }

  @Override
  public void assemble() {
    this.car.assemble();
  }
}
