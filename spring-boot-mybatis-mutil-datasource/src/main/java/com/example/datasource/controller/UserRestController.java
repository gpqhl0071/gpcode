package com.example.datasource.controller;

import com.example.datasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/api/user1", method = RequestMethod.GET)
  public void query1() {
    userService.queryList();
  }

  @RequestMapping(value = "/api/user2", method = RequestMethod.GET)
  public void query2() {
    userService.queryList2();
  }


}
