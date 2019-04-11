package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gao peng
 * @date 2019/4/11 17:48
 */
@RestController()
@RequestMapping(value = "/genapstemplate")
public class GenApsTemplate {

  @RequestMapping(produces = "application/json;charset=UTF-8")
  public String template() {
    StringBuffer sb = new StringBuffer();


    sb.append("public MSg exchangeProduct(String token, String iName, Map<String, String>  paramMap) {\n");
    sb.append("  UserIntegralExchangeResultMsg msg = new UserIntegralExchangeResultMsg();\n");
    sb.append("  UserIntegralExchangeResultMsg.Body body = null;\n");
    sb.append("\n");
    sb.append("  EnumRetCode erc = EnumRetCode.ERROR;\n");
    sb.append("  if (this.validateToken(token, iName)) {\n");
    sb.append("    try {\n");
    sb.append("      int userId = this.getUserIdByToken(token);\n");
    sb.append("\n");
    sb.append("      \n");
    sb.append("\n");
    sb.append("      erc = EnumRetCode.USER_INTEGRAL_CHARGE_RESULT_SUCCESS;\n");
    sb.append("\n");
    sb.append("    } catch (Exception e) {\n");
    sb.append("      log.error(\"积分兑换异常！\", e);\n");
    sb.append("    }\n");
    sb.append("\n");
    sb.append("  } else {\n");
    sb.append("    erc = EnumRetCode.NO_AUTH;\n");
    sb.append("  }\n");
    sb.append("\n");
    sb.append("  msg.setHeader(this.createHeaderByEnumRet(erc));\n");
    sb.append("  msg.setBody(body);\n");
    sb.append("  return msg;\n");
    sb.append("}\n");

    return sb.toString();
  }
}
