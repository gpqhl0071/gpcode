package com.example.work.util.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author gao peng
 * @date 2019/11/22 9:55
 */

@Repository
public class AreaDao {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  public List<Map<String, Object>> getArea() {
    StringBuffer sql = new StringBuffer();
    sql.append("SELECT * FROM t_area ");
    return jdbcTemplate.queryForList(sql.toString(), new Object[]{});
  }

  public List<Map<String, Object>> getprovince() {
    StringBuffer sql = new StringBuffer();
    sql.append("SELECT * FROM province ");
    return jdbcTemplate.queryForList(sql.toString(), new Object[]{});
  }

  public List<Map<String, Object>> getcity(String proviceId) {
    StringBuffer sql = new StringBuffer();
    sql.append("SELECT * FROM city where province_id = ?");
    return jdbcTemplate.queryForList(sql.toString(), new Object[]{proviceId});
  }

  public List<Map<String, Object>> getcounty(String cityId) {
    StringBuffer sql = new StringBuffer();
    sql.append("SELECT * FROM county where city_id = ? ");
    return jdbcTemplate.queryForList(sql.toString(), new Object[]{cityId});
  }
}
