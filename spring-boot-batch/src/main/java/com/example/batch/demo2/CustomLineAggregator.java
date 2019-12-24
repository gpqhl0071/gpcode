package com.example.batch.demo2;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.batch.item.file.transform.LineAggregator;

public class CustomLineAggregator implements LineAggregator<Customer> {
  private ObjectMapper objectMapper = new ObjectMapper();

  @Override
  public String aggregate(Customer item) {
    try {
      return objectMapper.writeValueAsString(item);
    } catch (Exception e) {
      throw new RuntimeException("Unable to serialize Customer", e);
    }
  }

}
