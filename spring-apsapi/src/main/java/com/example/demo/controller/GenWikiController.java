package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gao peng
 * @date 2019/4/11 16:09
 */

@RestController()
@RequestMapping(value = "/genwiki")
public class GenWikiController {

  @RequestMapping(produces = "application/json;charset=UTF-8")
  public String gen() {
    StringBuffer sb = new StringBuffer();

    sb.append("#### 1) 积分体系 -- 积分兑换界面API \n");
    sb.append(" \n");
    sb.append("##### 方法名称 \n");
    sb.append(" \n");
    sb.append("/userIntegral/queryIntegralProductList/ \n");
    sb.append(" \n");
    sb.append("##### 方法描述 \n");
    sb.append(" \n");
    sb.append("积分体系 -- 积分兑换界面API \n");
    sb.append(" \n");
    sb.append("##### 访问路径 \n");
    sb.append(" \n");
    sb.append("<http://ServiceAddress/userIntegral/queryIntegralProductList/{seqId}> \n");
    sb.append(" \n");
    sb.append("##### 输入参数 \n");
    sb.append(" \n");
    sb.append("|参数代码|参数名称|数据类型|参数说明| \n");
    sb.append("|---|---|---|---| \n");
    sb.append("|token|令牌值|varchar|随机字符串| \n");
    sb.append(" \n");
    sb.append(" \n");
    sb.append("##### 输出参数 \n");
    sb.append(" \n");
    sb.append("|参数代码|参数名称|数据类型|参数说明| \n");
    sb.append("|---|---|---|---| \n");
    sb.append("|total|总记录数|varchar| \n");
    sb.append(" \n");
    sb.append(" \n");
    sb.append("##### 响应报文示例 \n");
    sb.append(" \n");
    sb.append(" \n");
    sb.append("--- \n");

    return sb.toString();
  }
}
