package com.example.demo.apsTemplate;

import java.util.Map;

public class ApsCommonMsg extends Message implements IMsg {

  private static final long serialVersionUID = 6285228801849213141L;

  private Map<String, Object> body;

  public Map<String, Object> getBody() {
    return body;
  }

  public void setBody(Map<String, Object> body) {
    this.body = body;
  }
}
