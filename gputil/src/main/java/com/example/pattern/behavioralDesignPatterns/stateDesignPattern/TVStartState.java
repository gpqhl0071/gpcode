package com.example.pattern.behavioralDesignPatterns.stateDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 14:42
 */
public class TVStartState implements State {
  @Override
  public void doAction() {
    System.out.println("TV is turned ON");
  }
}
