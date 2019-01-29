package com.example.redUtil;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import sun.util.calendar.LocalGregorianCalendar;

import java.util.Date;

/**
 * @author gao peng
 * @date 2018/12/20 17:15
 */
public class DateU {
  public static void main(String[] args) {
    String str1 = DateUtil.format(new Date(), DatePattern.NORM_DATE_PATTERN);
    String str2 = "2019-01-21";

    DateTime d1 = DateUtil.parseDate(str1);
    DateTime d2 = DateUtil.parseDate(str2);

    DateTime dt = new DateTime();
    System.out.println(d1.compareTo(d2));

    if (d1.compareTo(d2) <= 0) {
      System.out.println("当前时间 d1");
      System.out.println(dt.between(d1.toJdkDate(), DateUnit.SECOND));
    }

    if (DateUtil.date().compareTo(d2) <= 0) {
      System.out.println("当前时间 d2");
      System.out.println(dt.between(d2.toJdkDate(), DateUnit.SECOND));
    }

    DateTime d = DateUtil.offsetMinute(DateUtil.date(), -5);

    System.out.println(DateUtil.format(d, "yyyy-MM-dd HH:mm:ss"));


    String s1 = DateUtil.format(new Date(), "yyyy-MM-dd 23:59:59");
    DateTime ss1 = DateUtil.parseDateTime(s1);
    System.out.println(DateUtil.offsetMonth(ss1.toJdkDate(), 1));
  }
}
