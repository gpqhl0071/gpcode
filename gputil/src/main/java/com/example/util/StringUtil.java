package com.example.util;

/**
 * @author gao peng
 * @date 2018/9/27 17:35
 */
public class StringUtil {
  public static void splace(StringBuffer mapSB, int num) {
    for (int i = 0; i < num; i++) {
      mapSB.append(" ");
    }
  }


  public static void enter(StringBuffer mapSB) {
    mapSB.append("\n\r");
  }

  public static String upperFirstLetter(String humpColumnName) {
    humpColumnName = humpColumnName.substring(0, 1).toUpperCase() + humpColumnName.substring(1, humpColumnName.length());
    return humpColumnName;
  }
}
