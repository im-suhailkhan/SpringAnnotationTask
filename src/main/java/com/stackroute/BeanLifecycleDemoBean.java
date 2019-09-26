package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @PostConstruct
    public void customInit(){
        System.out.println("inside custom init method");
    }

    @PreDestroy
    public void customDestroy(){
        System.out.println("inside custom destroy method");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("inside destruction interface");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("inside initialisation interface");

    }


}