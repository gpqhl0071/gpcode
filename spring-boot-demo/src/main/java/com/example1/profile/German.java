package com.example1.profile;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Configuration
@Profile(value = "prod")
@Component
public class German implements MoveFactor {
  @Override
  public void speak() {
    System.out.println("i am German");
  }
}
