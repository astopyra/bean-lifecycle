package com.kodilla.bean_lifecycle.event;

import org.springframework.context.ApplicationEvent;

public class CalcEvent extends ApplicationEvent {

    private String methodName;

    public CalcEvent(Object source, String methodName) {
        super(source);
        this.methodName = methodName;
    }

    public String getMethodName() {
        return this.methodName;
    }
}
