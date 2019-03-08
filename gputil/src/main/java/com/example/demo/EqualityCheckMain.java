package com.example.demo;

/**
 * @author gao peng
 * @date 2019/3/7 14:08
 */
public class EqualityCheckMain {
  public static void main(String[] args) {

    Country india1 = new Country();
    india1.setName("India");
    Country india2 = new Country();
    india2.setName("India");
    System.out.println("Is india1 is equal to india2:" + india1.equals(india2));
  }
}
