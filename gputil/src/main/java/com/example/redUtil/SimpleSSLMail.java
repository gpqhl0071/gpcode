package com.example.redUtil;

import cn.hutool.extra.mail.MailUtil;

public class SimpleSSLMail {

  public static void main(String[] args) throws Exception {
    MailUtil.send("1110@forex.com.cn", "测试", "邮件来自Hutool测试", true);

  }

}