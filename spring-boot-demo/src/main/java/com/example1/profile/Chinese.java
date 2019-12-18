package com.example1.profile;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Configuration
@Profile(value = "dev")
@Component
public class Chinese implements MoveFactor {
  @Override
  public void speak() {
    System.out.println("i am chinese");
  }
}
