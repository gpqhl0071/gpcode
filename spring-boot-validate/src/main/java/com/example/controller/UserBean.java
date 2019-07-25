package com.example.controller;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author gao peng
 * @date 2019/7/24 17:45
 */
@Component
public class UserBean {

  private String name;
  private String age;

  @NotEmpty(message = "用户名不能为空")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }
}
