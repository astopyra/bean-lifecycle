package com.kodilla.bean_lifecycle.service;

import com.kodilla.bean_lifecycle.event.CalcEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CalcListener implements ApplicationListener<CalcEvent> {

    private static final Logger LOGGER = LogManager.getLogger(CalcListener.class);

    @Override
    public void onApplicationEvent(CalcEvent event) {
       LOGGER.info("Method {} invoked in calculator", event.getMethodName());
    }
}
