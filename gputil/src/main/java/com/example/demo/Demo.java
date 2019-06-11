package com.example.demo;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;

import java.util.Date;

/**
 * @author gao peng
 * @date 2019/5/14 15:37
 */
public class Demo {

  public static void main(String[] args) {
    Date d1 = new Date();
    Date d2 = DateUtil.parse("2019-06-05 09:41:03");

    System.out.println(DateUtil.between(d1, d2, DateUnit.SECOND));
  }

  public static boolean isAnniversary(Date date) {
    if (cn.hutool.core.date.DateUtil.year(new Date()) == cn.hutool.core.date.DateUtil.year(date)) {
      return false;
    }
    // 月
    int currMonth = cn.hutool.core.date.DateUtil.month(new Date());
    int targetMonth = cn.hutool.core.date.DateUtil.month(date);
    boolean isSameMonth = currMonth == targetMonth;
    // 天
    int currDays = cn.hutool.core.date.DateUtil.dayOfMonth(new Date());
    int targetDays = cn.hutool.core.date.DateUtil.dayOfMonth(date);
    boolean isSameDays = currDays == targetDays;

    // 闰年注册的用户特殊考虑，考虑平年没有2月29日，所以在平年的时候，针对2月29日的用户，2月28日为周年日
    DateTime dt = new DateTime();
    if (!dt.isLeapYear()) {
      // 如果是平年
      if (targetMonth == 2 && targetDays == 29 && currMonth == 2 && currDays == 28) {
        return true;
      }
    }
    return isSameMonth && isSameDays ? true : false;
  }
}
