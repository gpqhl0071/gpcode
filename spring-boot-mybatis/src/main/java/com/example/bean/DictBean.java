package com.example.bean;

/**
 * @author gao peng
 * @date 2018/8/20 16:51
 */
public class DictBean {

  private long id;
  private String type;
  private String key;
  private String value;
  private String content;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public String toString() {
    return "DictBean{" +
      "id=" + id +
      ", type='" + type + '\'' +
      ", key='" + key + '\'' +
      ", value='" + value + '\'' +
      ", content='" + content + '\'' +
      '}';
  }
}
