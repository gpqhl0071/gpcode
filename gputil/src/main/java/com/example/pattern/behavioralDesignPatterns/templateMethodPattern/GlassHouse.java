package com.example.pattern.behavioralDesignPatterns.templateMethodPattern;

/**
 * @author gao peng
 * @date 2019/8/6 11:34
 */
public class GlassHouse extends HouseTemplate {
  @Override
  public void buildWalls() {
    System.out.println("Building Glass Walls");
  }

  @Override
  public void buildPillars() {
    System.out.println("Building Pillars with glass coating");
  }
}
