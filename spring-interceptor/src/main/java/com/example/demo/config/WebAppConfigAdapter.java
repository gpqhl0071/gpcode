package com.example.demo.config;

import com.example.demo.interceptor.RequestProcessingTimeInterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author gao peng
 * @date 2019/10/10 15:18
 */
@Component
public class WebAppConfigAdapter extends WebMvcConfigurerAdapter {
  @Autowired
  private RequestProcessingTimeInterceptor requestProcessingTimeInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
//    super.addInterceptors(registry);

    registry.addInterceptor(requestProcessingTimeInterceptor);
  }
}
