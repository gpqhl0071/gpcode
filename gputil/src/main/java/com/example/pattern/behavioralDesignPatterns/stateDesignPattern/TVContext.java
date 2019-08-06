package com.example.pattern.behavioralDesignPatterns.stateDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 14:42
 */
public class TVContext implements State {
  private State tvState;

  public void setState(State state) {
    this.tvState = state;
  }

  public State getState() {
    return this.tvState;
  }

  @Override
  public void doAction() {
    this.tvState.doAction();
  }
}
