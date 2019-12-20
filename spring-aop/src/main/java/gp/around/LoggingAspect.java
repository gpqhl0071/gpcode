package gp.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

  @Around("execution(* gp.around.EmployeeManagerImpl.*(..))")
  public void logAroundAllMethods(ProceedingJoinPoint joinPoint) throws Throwable {
    System.out.println("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName() + ": Before Method Execution");
    try {
      joinPoint.proceed();
    } finally {
      //Do Something useful, If you have
    }
    System.out.println("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName() + ": After Method Execution");

  }
}
