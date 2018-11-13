package com.example.util;

import java.math.BigDecimal;

/**
 * @author gao peng
 * @date 2018/11/12 11:06
 */
public class BigDecimalUtils {
  public static void main(String[] args) {
    System.out.println(new BigDecimal("12.1").setScale(0, BigDecimal.ROUND_UP));
  }
}
