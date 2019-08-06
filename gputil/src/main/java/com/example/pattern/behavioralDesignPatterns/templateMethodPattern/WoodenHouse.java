package com.example.pattern.behavioralDesignPatterns.templateMethodPattern;

/**
 * @author gao peng
 * @date 2019/8/6 11:33
 */
public class WoodenHouse extends HouseTemplate {
  @Override
  public void buildWalls() {
    System.out.println("Building Wooden Walls");
  }

  @Override
  public void buildPillars() {
    System.out.println("Building Pillars with Wood coating");
  }
}
