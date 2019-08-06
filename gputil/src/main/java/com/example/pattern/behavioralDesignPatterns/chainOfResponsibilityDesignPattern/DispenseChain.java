package com.example.pattern.behavioralDesignPatterns.chainOfResponsibilityDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 13:55
 */
public interface DispenseChain {

  void setNextChain(DispenseChain nextChain);

  void dispense(Currency cur);
}
