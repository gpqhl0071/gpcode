package com.example.dxShopUtil;

/**
 * @author gao peng
 * @date 2019/2/18 17:04
 */
public class RandomUtil {

  public static void main(String[] args) {
    String[] strs = new String[] {
      "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
      "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    };

    StringBuffer sb = new StringBuffer();
    int i = 0;
    while (i < 7) {
      i++;
      int random_index = (int) (Math.random() * strs.length);
      sb.append(strs[random_index]);
    }
    System.out.println(sb.toString());
  }
}
