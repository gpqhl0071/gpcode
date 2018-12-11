package com.example.redUtil;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gao peng
 * @date 2018/12/11 17:49
 */
public class Red {
  public static Map<Integer, Integer> redMap;

  public void init() {
    redMap = new ConcurrentHashMap<Integer, Integer>();
    redMap.clear();
    redMap.put(1, 3);  // 1888元入伙红包
    redMap.put(2, 6);  // 888元入伙红包
    redMap.put(3, 21);  // 518元入伙红包
    redMap.put(4, 90);  // 218元入伙红包
    redMap.put(5, 105);  // 88元入伙红包
    redMap.put(6, 21);  // 28元入伙红包
    redMap.put(7, 3);  // 0.6%加息券
    redMap.put(8, 6);  // 0.3%加息券
    redMap.put(9, 15);  // 0.1%加息券
    redMap.put(10, 9999999);  // 无
  }
}
