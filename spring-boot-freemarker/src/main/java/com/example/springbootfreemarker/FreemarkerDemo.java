package com.example.springbootfreemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.Version;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gao peng
 * @date 2019/8/21 9:44
 */
public class FreemarkerDemo {
  public static void main(String[] args) throws IOException,
      TemplateException {

    Configuration cfg = new Configuration(new Version("2.3.23"));

    cfg.setDirectoryForTemplateLoading(new File("E:\\gpcode\\spring-boot-freemarker\\src\\main\\resources\\templates"));
    cfg.setDefaultEncoding("UTF-8");

    Template template = cfg.getTemplate("/test.ftl");

    Map<String, Object> templateData = new HashMap<>();
    templateData.put("msg", "Today is a beautiful day");

    try (StringWriter out = new StringWriter()) {

      template.process(templateData, out);
      System.out.println(out.getBuffer().toString());

      out.flush();
    }
  }
}
