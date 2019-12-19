package com.example1.import1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigB {

  @Bean(name = "toyota")
  public Car getToyota() {
    return new Toyota();
  }

}
