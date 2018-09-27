package com.example.util;

/**
 * 驼峰格式转换工具类
 *
 * @author gao peng
 * @date 2018/9/27 16:27
 */
public class HumpUtil {

  /***
   * 下划线命名转为驼峰命名
   *
   * @param para
   *        下划线命名的字符串
   */

  public static String underlineToHump(String para) {
    StringBuilder result = new StringBuilder();
    String a[] = para.split("_");
    for (String s : a) {
      if (result.length() == 0) {
        result.append(s.toLowerCase());
      } else {
        result.append(s.substring(0, 1).toUpperCase());
        result.append(s.substring(1).toLowerCase());
      }
    }
    return result.toString();
  }


  /***
   * 驼峰命名转为下划线命名
   *
   * @param para
   *        驼峰命名的字符串
   */

  public static String humpToUnderline(String para) {
    StringBuilder sb = new StringBuilder(para);
    int temp = 0;//定位
    for (int i = 0; i < para.length(); i++) {
      if (Character.isUpperCase(para.charAt(i))) {
        sb.insert(i + temp, "_");
        temp += 1;
      }
    }
    return sb.toString().toUpperCase();
  }

}
