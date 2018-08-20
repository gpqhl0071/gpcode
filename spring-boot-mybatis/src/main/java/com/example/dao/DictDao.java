package com.example.dao;

import com.example.bean.DictBean;
import org.apache.ibatis.annotations.Param;

/**
 * @author gao peng
 * @date 2018/8/20 16:29
 */
public interface DictDao {
  public DictBean queryById(@Param("id") int id);
}
