package com.example1.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CatBeanPostProcessor implements BeanPostProcessor {

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    if(bean instanceof Cat){
      Cat cat = (Cat)bean;
      System.out.println("==========" + " postProcessBeforeInitialization ");
      cat.say();
      return cat;
    }
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    if(bean instanceof Cat){
      Cat cat = (Cat)bean;
      cat.setName("hello peng");
      cat.setAge(31);
      System.out.println("==========" + " postProcessAfterInitialization ");
      return cat;
    }
    return bean;
  }
}
