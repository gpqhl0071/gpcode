package com.example.batch.demo2;


import org.springframework.batch.item.ItemWriter;
import org.springframework.classify.Classifier;

public class CustomerClassifier implements Classifier<Customer, ItemWriter<? super Customer>> {

  private static final long serialVersionId = 1L;

  private ItemWriter<Customer> evenItemWriter;
  private ItemWriter<Customer> oddItemWriter;

  public CustomerClassifier(ItemWriter<Customer> evenItemWriter, ItemWriter<Customer> oddItemWriter) {
    this.evenItemWriter = evenItemWriter;
    this.oddItemWriter = oddItemWriter;
  }

  @Override
  public ItemWriter<? super Customer> classify(Customer customer) {
    return customer.getId() % 2 == 0 ? evenItemWriter : oddItemWriter;
  }
}
