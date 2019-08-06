package com.example.pattern.behavioralDesignPatterns.visitorDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 14:48
 */
public interface ShoppingCartVisitor {
  int visit(Book book);

  int visit(Fruit fruit);
}
