package com.example1.lookup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class PrototypeBean {
  private static final Logger logger = LoggerFactory.getLogger(PrototypeBean.class);

  public void say() {
    logger.info("say something...");
  }
}

/*@Component
class SingletonBean {
  private static final Logger logger = LoggerFactory.getLogger(SingletonBean.class);

  @Autowired
  private PrototypeBean bean;

  public void print() {
    logger.info("Bean SingletonBean's HashCode : {}", bean.hashCode());
    bean.say();
  }
}*/

@Component
abstract class SingletonBean {
  private static final Logger logger = LoggerFactory.getLogger(SingletonBean.class);

  public void print() {
    PrototypeBean bean = methodInject();
    logger.info("Bean SingletonBean's HashCode : {}", bean.hashCode());
    bean.say();
  }

  // 也可以写成 @Lookup("prototypeBean") 来指定需要注入的bean
  @Lookup
  protected abstract PrototypeBean methodInject();
}

@SpringBootApplication
class SampleApplication {
  private static final Logger logger = LoggerFactory.getLogger(SampleApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(SampleApplication.class, args);
  }

  @Bean
  public CommandLineRunner test(final SingletonBean bean) {
    return (args) -> {
      logger.info("测试单例bean和原型bean的调用");
      int i = 0;
      while (i < 3) {
        i++;
        bean.print();
      }
    };
  }
}