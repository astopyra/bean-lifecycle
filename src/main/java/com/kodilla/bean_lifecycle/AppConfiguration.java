package com.kodilla.bean_lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class AppConfiguration {

    @Bean
    public LibraryManager libraryManager() {
        return new LibraryManager();
    }

    @Bean
    public BeanMonitor beanMonitor() {
        return new BeanMonitor();
    }

    @Bean
    public LoggingBeanMonitor loggingBeanPostProcessor() {
        return new LoggingBeanMonitor();
    }
}
