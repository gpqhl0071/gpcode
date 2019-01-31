package com.example.demo.controller;

import com.example.demo.validate.Persion;
import com.example.demo.validate.PersionValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gao peng
 * @date 2019/1/31 15:43
 */
@RestController
public class PersionController {

  @Autowired
  private PersionValidator persionValidator;

  @RequestMapping("/persion/save/")
  public String save(@ModelAttribute("persion") Persion persion,
                     org.springframework.validation.BindingResult bindResult) {

    persionValidator.validate(persion, bindResult);

    if (bindResult.hasErrors()) {
      return bindResult.getFieldError().getCode();
    }
    return "success";
  }
}
