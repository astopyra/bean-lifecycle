package com.kodilla.bean_lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beans")
public class BeanController {

    @Autowired
    private ApplicationContext context;

    @GetMapping("/createBean")
    public String createBean() {
        SimpleBean simpleBean = context.getBean(SimpleBean.class);
        return "Bean created: " + simpleBean;
    }
}
