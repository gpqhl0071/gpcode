package com.example1.importResource;

import com.example1.profile.TestProfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestImportResource {
  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(XmlConfiguration.class);

    HelloService helloService = (HelloService) applicationContext.getBean(HelloService.class);

    helloService.method();
  }
}
