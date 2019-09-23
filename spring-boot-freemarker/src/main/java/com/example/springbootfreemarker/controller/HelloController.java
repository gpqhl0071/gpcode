package com.example.springbootfreemarker.controller;

import freemarker.template.Configuration;
import freemarker.template.Template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

/**
 * @author gao peng
 * @date 2019/9/23 15:13
 */
@Controller
public class HelloController {
  @Autowired
  private Configuration configuration;

  @GetMapping(value = "/hello")
  @ResponseBody
  public void hello(
      HttpServletResponse response,
      Model model,
      @RequestParam(value = "name", required = false, defaultValue = "World") String name) throws Exception {
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("name", name);

    Template template = configuration.getTemplate("hello.ftl");

    StringWriter sw = new StringWriter();
    template.process(params, sw);
    System.out.println(sw.toString());

    Writer writer = response.getWriter();
    writer.write(sw.toString());
    writer.close();
  }
}
