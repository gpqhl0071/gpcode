package com.example.pattern.behavioralDesignPatterns.interpreterDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 14:53
 */
public class IntToBinaryExpression implements Expression {
  private int i;

  public IntToBinaryExpression(int c) {
    this.i = c;
  }

  @Override
  public String interpret(InterpreterContext ic) {
    return ic.getBinaryFormat(this.i);
  }
}
