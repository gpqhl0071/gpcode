package com.example.service.impl;

import com.example.bean.DictBean;
import com.example.dao.DictDao;
import com.example.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gao peng
 * @date 2018/8/20 17:06
 */
@Service
public class DictServiceImpl implements DictService {

  @Autowired
  private DictDao dictDao;

  @Override
  public DictBean queryById(int id) {
    return dictDao.queryById(id);
  }
}
