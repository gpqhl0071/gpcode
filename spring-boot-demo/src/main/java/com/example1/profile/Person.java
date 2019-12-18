package com.example1.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
  @Autowired
  private MoveFactor moveFactor;

  public void speak() {
    moveFactor.speak();
  }

}
