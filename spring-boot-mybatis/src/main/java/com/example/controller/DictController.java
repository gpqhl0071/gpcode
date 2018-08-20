package com.example.controller;

import com.example.bean.DictBean;
import com.example.dao.DictDao;
import com.example.service.DictService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gao peng
 * @date 2018/8/20 16:58
 */
@RestController
public class DictController {

  @Autowired
  private DictService dictService;

  @RequestMapping(value = "/dict/getDict/{id}", method = RequestMethod.GET)
  public String getDict(@PathVariable("id") int id) {

    DictBean dictBean = dictService.queryById(id);
    System.out.println(dictBean.toString());

    return "success";
  }

}
