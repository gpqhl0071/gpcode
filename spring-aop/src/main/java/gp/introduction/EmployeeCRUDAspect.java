package gp.introduction;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeCRUDAspect {

  @Before("execution(* EmployeeManager.getEmployeeById(..))")
  public void logBeforeV1(JoinPoint joinPoint){
    System.out.println("EmployeeCRUDAspect.logBeforeV1() : " + joinPoint.getSignature().getName());
  }

}
