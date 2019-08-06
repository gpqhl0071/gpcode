package com.example.pattern.behavioralDesignPatterns.visitorDesignPattern;

/**
 * @author gao peng
 * @date 2019/8/6 14:47
 */
public class Book implements ItemElement {
  private int price;
  private String isbnNumber;

  public Book(int cost, String isbn) {
    this.price = cost;
    this.isbnNumber = isbn;
  }

  public int getPrice() {
    return price;
  }

  public String getIsbnNumber() {
    return isbnNumber;
  }

  @Override
  public int accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }

}
