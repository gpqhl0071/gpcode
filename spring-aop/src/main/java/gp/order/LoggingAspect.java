package gp.order;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

  @Order(1)
  @Before("execution(* gp.order.EmployeeManagerImpl.*(..))")
  public void before() throws Throwable {
    System.out.println(" i am first ");
  }
}
