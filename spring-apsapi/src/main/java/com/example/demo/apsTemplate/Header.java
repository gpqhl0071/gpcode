package com.example.demo.apsTemplate;

/**
 * 返回消息头部内容
 *
 * @author HuangYiwei
 */
public class Header {
  /**
   * 消息结果编码
   */
  public Integer retCode = null;

  /**
   * 消息结果
   */
  public String retMsg = null;

  public Integer getRetCode() {
    return retCode;
  }

  public void setRetCode(Integer retCode) {
    this.retCode = retCode;
  }

  public String getRetMsg() {
    return retMsg;
  }

  public void setRetMsg(String retMsg) {
    this.retMsg = retMsg;
  }
}
