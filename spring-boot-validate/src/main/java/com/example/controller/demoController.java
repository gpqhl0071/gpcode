package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @author gao peng
 * @date 2019/7/24 17:42
 */
@Controller
public class demoController {


  @RequestMapping(value = "/validate", method = RequestMethod.POST)
  public void generator(@Valid UserBean userBean, HttpServletResponse response, BindingResult bindingResult) throws Exception {

    String result = "ok";

    if (bindingResult.hasErrors()) {
      List<ObjectError> ls = bindingResult.getAllErrors();
      for (int i = 0; i < ls.size(); i++) {
        result = String.valueOf(ls.get(i));
      }
    }

    response.getOutputStream().write(result.getBytes());
  }
}
