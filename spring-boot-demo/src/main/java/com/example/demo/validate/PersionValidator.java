package com.example.demo.validate;

import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author gao peng
 * @date 2019/1/31 15:32
 */
@Component
public class PersionValidator implements Validator {
  @Override
  public boolean supports(Class<?> clazz) {
    return Persion.class.equals(clazz);
  }

  @Override
  public void validate(Object o, Errors errors) {

    ValidationUtils.rejectIfEmpty(errors, "name", "name is emptry");
  }
}
