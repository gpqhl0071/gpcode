package com.example.pattern.behavioralDesignPatterns.visitorDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 14:47
 */
public interface ItemElement {
  public int accept(ShoppingCartVisitor visitor);
}
