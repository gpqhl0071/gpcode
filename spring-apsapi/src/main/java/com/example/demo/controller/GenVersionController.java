package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author gao peng
 * @date 2019/7/23 10:43
 */
@RestController()
@RequestMapping(value = "/gen")
public class GenVersionController {

  @RequestMapping(value = "/android", produces = "application/json;charset=UTF-8")
  public void android(HttpServletResponse response,
      HttpServletRequest request) throws Exception {
    String versionName = request.getParameter("version_name");
    String versionCode = request.getParameter("version_code");

    String sql = "INSERT INTO `t_mobile_version` (`platform_name`, `platform_type`, `version_name`, `version_code`, " +
        "`status`) VALUES ('Android', 2, 'v" + versionName + "', " + versionCode + ", 1);";

    response.getOutputStream().write(sql.getBytes());
  }

  @RequestMapping(value = "/ios", produces = "application/json;charset=UTF-8")
  public void ios(HttpServletResponse response,
      HttpServletRequest request) throws Exception {
    String versionName = request.getParameter("version_name");
    String versionCode = request.getParameter("version_code");

    String sql = "INSERT INTO `t_mobile_version` (`platform_name`, `platform_type`, `version_name`, `version_code`, " +
        "`status`) VALUES ('iOS', 1, 'v" + versionName + "', " + versionCode + ", 1);";

    response.getOutputStream().write(sql.getBytes());
  }
}
