package com.example.pattern.behavioralDesignPatterns.chainOfResponsibilityDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 13:55
 */
public class Currency {
  private int amount;

  public Currency(int amt) {
    this.amount = amt;
  }

  public int getAmount() {
    return this.amount;
  }
}
