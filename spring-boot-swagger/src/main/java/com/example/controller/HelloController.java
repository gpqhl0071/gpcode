package com.example.controller;

import com.google.common.collect.ImmutableMap;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Map;

/**
 * 运行结果图：http://ww1.sinaimg.cn/large/9b13c8fdgy1fusw3tjl76j21401gf77x.jpg
 *
 * @author gao peng
 * @date 2018/8/29 17:22
 */
@RestController
@Api(value = "onlinestore", description = "Operations pertaining to products in Online Store")
public class HelloController {

  @ApiImplicitParams( {
    @ApiImplicitParam(name = "a", value = "参数A"),
    @ApiImplicitParam(name = "b", value = "参数B")
  }
  )
  @RequestMapping(method = RequestMethod.GET, path = "/hello")
  @ResponseBody
  public String index(@RequestParam String a,
                      @RequestParam String b) {
    return "hello " + a + ", hello " + b;
  }
}
