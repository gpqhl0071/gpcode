package com.example.pattern.behavioralDesignPatterns.stateDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 14:43
 */
public class TVRemote {
  public static void main(String[] args) {
    TVContext context = new TVContext();
    State tvStartState = new TVStartState();
    State tvStopState = new TVStopState();

    context.setState(tvStartState);
    context.doAction();


    context.setState(tvStopState);
    context.doAction();

  }
}
