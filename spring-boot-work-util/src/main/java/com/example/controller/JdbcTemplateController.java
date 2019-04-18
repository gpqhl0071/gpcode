package com.example.controller;

import com.example.work.util.service.GeneratorBeanService;
import com.example.work.util.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author gao peng
 * @date 2018/9/28 14:47
 */
@RestController()
@RequestMapping(value = "/jdbcTemplate")
public class JdbcTemplateController {
  @Autowired
  private TableService tableService;
  @Autowired
  private GeneratorBeanService generatorBeanService;

  @RequestMapping(value = "/generator/{tableName}", method = RequestMethod.GET)
  public void generator(@PathVariable("tableName") String tableName, HttpServletResponse response) throws Exception {
    String result = tableService.generatorJDBCTemplate(tableName);

    System.out.println(result);

    response.getOutputStream().write(result.getBytes());
  }

  @RequestMapping(value = "/bean/{tableName}", method = RequestMethod.GET)
  public void bean(@PathVariable("tableName") String tableName, HttpServletResponse response) throws Exception {
    String result = generatorBeanService.handle(tableName);

    System.out.println(result);

    response.getOutputStream().write(result.getBytes());
  }
}
