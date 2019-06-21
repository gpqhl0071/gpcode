package com.example.work.util.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author gao peng
 * @date 2018/9/27 13:38
 */
@Repository
public class TableDao {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  public List<Map<String, Object>> getTableInfo(String tableName){
    StringBuffer sql = new StringBuffer();
    sql.append("SELECT c.COLUMN_NAME,c.DATA_TYPE,c.COLUMN_COMMENT ");
    sql.append(" FROM information_schema.`COLUMNS` AS c ");
    sql.append(" WHERE c.TABLE_NAME = ?");
    return jdbcTemplate.queryForList(sql.toString(), new Object[]{tableName});
  }

  public List<Map<String, Object>> get(){
    StringBuffer sql = new StringBuffer();
    sql.append(" SELECT * FROM t_withdraw WHERE");
    sql.append(" apply_time > '2019-05-22 00:00:00'");
    sql.append(" AND apply_time < '2019-06-22 00:00:00'");
    sql.append(" AND state = 5");
    sql.append(" ORDER BY apply_time");

    return jdbcTemplate.queryForList(sql.toString(), new Object[]{});
  }
}
