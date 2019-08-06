package com.example.pattern.behavioralDesignPatterns.interpreterDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 14:53
 */
public interface Expression {
  String interpret(InterpreterContext ic);
}
