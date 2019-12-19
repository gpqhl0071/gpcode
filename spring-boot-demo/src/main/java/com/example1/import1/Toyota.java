package com.example1.import1;

import org.springframework.stereotype.Component;

@Component
public class Toyota implements Car {
  @Override
  public void print() {
    System.out.println("i am Toyota");
  }
}
