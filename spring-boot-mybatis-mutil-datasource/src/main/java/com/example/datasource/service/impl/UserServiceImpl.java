package com.example.datasource.service.impl;

import com.example.datasource.dao.cluster.UserDao;
import com.example.datasource.dao.master.UserDao2;
import com.example.datasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserDao userDao;
  @Autowired
  private UserDao2 userDao2;

  @Override
  public List queryList() {
    List<Map<String, Object>> list = userDao.findList();
    for (Map<String, Object> map : list) {
      System.out.println(map.get("id"));
    }
    return list;
  }

  @Override
  public List queryList2() {
    List<Map<String, Object>> list = userDao2.findList2();
    for (Map<String, Object> map : list) {
      System.out.println(map.get("id"));
    }
    return list;
  }
}
