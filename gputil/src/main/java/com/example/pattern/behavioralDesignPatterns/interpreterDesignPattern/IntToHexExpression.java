package com.example.pattern.behavioralDesignPatterns.interpreterDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 14:54
 */
public class IntToHexExpression implements Expression {
  private int i;

  public IntToHexExpression(int c) {
    this.i = c;
  }

  @Override
  public String interpret(InterpreterContext ic) {
    return ic.getHexadecimalFormat(i);
  }
}
