package com.example.springcloudconfigclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class SpringCloudConfigClientApplication {

  public static void main(String[] args) {
//    SpringApplication.run(SpringCloudConfigClientApplication.class, args);
    new SpringApplicationBuilder(SpringCloudConfigClientApplication.class).web(true).run(args);
  }

}

