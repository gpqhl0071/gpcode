package com.example.pattern.behavioralDesignPatterns.templateMethodPattern;

/**
 * @author gao peng
 * @date 2019/8/6 11:34
 */
public class HousingClient {
  public static void main(String[] args) {

    HouseTemplate houseType = new WoodenHouse();

    //using template method
    houseType.buildHouse();
    System.out.println("************");

    houseType = new GlassHouse();

    houseType.buildHouse();
  }
}
