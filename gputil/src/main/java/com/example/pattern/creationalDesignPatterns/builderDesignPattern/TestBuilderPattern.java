package com.example.pattern.creationalDesignPatterns.builderDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/5 16:59
 */
public class TestBuilderPattern {
  public static void main(String[] args) {
    //Using builder to get the object in a single line of code and
    //without any inconsistent state or arguments management issues
    Computer comp = new Computer.ComputerBuilder(
        "500 GB", "2 GB").setBluetoothEnabled(true)
        .setGraphicsCardEnabled(true).build();
  }
}
