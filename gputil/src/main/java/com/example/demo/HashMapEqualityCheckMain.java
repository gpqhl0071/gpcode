package com.example.demo;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author gao peng
 * @date 2019/3/7 14:11
 */
public class HashMapEqualityCheckMain {
  public static void main(String[] args) {
    HashMap<Country, String> countryCapitalMap = new HashMap<Country, String>();
    Country india1 = new Country();
    india1.setName("India");
    Country india2 = new Country();
    india2.setName("India");

    countryCapitalMap.put(india1, "Delhi");
    countryCapitalMap.put(india2, "Delhi");

    Iterator countryCapitalIter = countryCapitalMap.keySet().iterator();
    while (countryCapitalIter.hasNext()) {
      Country countryObj = (Country) countryCapitalIter.next();
      String capital = countryCapitalMap.get(countryObj);
      System.out.println("Capital of " + countryObj.getName() + "----" + capital);

    }
  }
}
