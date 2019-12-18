package com.example.demo.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

@Component
public class NameAware implements BeanFactoryAware, ServletContextAware {

  BeanFactory bFactory;

  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    String[] s = beanFactory.toString().split(",");
    for(String str : s){
      System.out.println(str);
    }
  }

  @Override
  public void setServletContext(ServletContext servletContext) {
//    String[] s = servletContext.toString().split(",");
//    for(String str : s){
//      System.out.println(str);
//    }
  }
}
