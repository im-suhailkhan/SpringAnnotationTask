package com.stackroute;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements BeanPostProcessor {

    @PostConstruct
    public void customInit(){
        System.out.println("inside custom init method");
    }

    @PreDestroy
    public void customDestroy(){
        System.out.println("inside custom destroy method");

    }



    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("post before init");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("post after init");
        return null;
    }
}