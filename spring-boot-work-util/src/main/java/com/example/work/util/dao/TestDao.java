package com.example.work.util.dao;

import com.example.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author gao peng
 * @date 2018/10/15 10:44
 */
@Repository
public class TestDao {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  public void test() {
    Date startD = DateUtil.String2Date("2010-01-01");
    while (true) {

      startD = DateUtil.addDate(startD, Calendar.DATE, 1, DateUtil.timeZoneBeijing);

      String d = DateUtil.Date2String(startD);

      String sql = "INSERT INTO `t_agent_employee_commission` (`day`, `employeeId`, `joinAmount`, `joinCommission`, `inputTime`, `strategy_amount`) " +
        "VALUES " +
        "( '" + d + "', '1360', 0, 0, NOW(), 0);";

      exe(sql);

      try {
        TimeUnit.MILLISECONDS.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      if (DateUtil.compare(new Date(), startD) == 0) {
        break;
      }
    }

  }

  private void exe(String sql) {
    Thread t = new Thread(new Runnable() {
      @Override
      public void run() {
        jdbcTemplate.execute(sql);
        System.out.println("执行插入," + sql);
      }
    });

    t.start();
  }

}
