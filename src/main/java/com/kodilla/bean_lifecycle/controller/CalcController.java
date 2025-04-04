package com.kodilla.bean_lifecycle.controller;


import com.kodilla.bean_lifecycle.event.CalcEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalcController implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;
    private String methodName;

    @GetMapping("add")
    public int add(@RequestParam int a, @RequestParam int b) {
        methodName = "add";
        publisher.publishEvent(new CalcEvent(this, methodName));
        return a+b;
    }

    @GetMapping("subtract")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        methodName = "subtract";
        publisher.publishEvent(new CalcEvent(this, methodName));
        return a-b;
    }

    @GetMapping("multiply")
    public long multiply(int a, int b) {
        methodName = "multiply";
        publisher.publishEvent(new CalcEvent(this, methodName));
        return (long) a *b;
    }

    @GetMapping("devide")
    public double devide(int a, int b) {
        methodName = "devide";
        publisher.publishEvent(new CalcEvent(this, methodName));
        return (double) a /b;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
