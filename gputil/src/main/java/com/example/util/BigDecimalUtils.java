package com.example.util;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author gao peng
 * @date 2018/11/12 11:06
 */
public class BigDecimalUtils {
  public static void main(String[] args) {
    System.out.println(new BigDecimal("12.1").setScale(0, BigDecimal.ROUND_UP));
    System.out.println(new BigDecimal("12.9").setScale(0, BigDecimal.ROUND_UP));
    System.out.println(new BigDecimal("12.1").setScale(0, BigDecimal.ROUND_DOWN));
    System.out.println(new BigDecimal("12.9").setScale(0, BigDecimal.ROUND_DOWN));

    String strFromDate = "20181212";
    String strToDate = "20181212";
    Calendar clFrom = new GregorianCalendar();
    int iYear = Integer.parseInt(strFromDate.substring(0, 4));
    int iMonth = Integer.parseInt(strFromDate.substring(4, 6));
    int iDay = Integer.parseInt(strFromDate.substring(6, 8));
    clFrom.set(iYear, iMonth, iDay, 0, 0, 0);
    Calendar clTo = new GregorianCalendar();
    iYear = Integer.parseInt(strToDate.substring(0, 4));
    iMonth = Integer.parseInt(strToDate.substring(4, 6));
    iDay = Integer.parseInt(strToDate.substring(6, 8));
    clTo.set(iYear, iMonth, iDay, 0, 0, 0);
    long llTmp = clTo.getTime().getTime() - clFrom.getTime().getTime();

    System.out.println((new Long(llTmp / 1000L / 3600L / 24L)).intValue());
  }
}
