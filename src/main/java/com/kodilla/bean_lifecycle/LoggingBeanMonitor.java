package com.kodilla.bean_lifecycle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class LoggingBeanMonitor implements BeanPostProcessor {

    private static final Logger LOGGER = LogManager.getLogger(LoggingBeanMonitor.class) ;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        LOGGER.info("Message before initialization of bean: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        LOGGER.info("Message after initialization of bean: " + beanName);
        return bean;
    }
}
