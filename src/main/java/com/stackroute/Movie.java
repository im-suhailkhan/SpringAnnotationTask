package com.stackroute;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("movie")
public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {

    @Autowired
    private Actor actor;

    private ApplicationContext context =null;
    private String beanName;
    private BeanFactory beanFactory1;
   /* public Movie(Actor actor) {
        this.actor = actor;
    }*/

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory1=beanFactory;
        System.out.println("Bean Factory"+beanFactory1);
    }

    @Override
    public void setBeanName(String s) {
        this.beanName=s;
        System.out.println("BeanName" + beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
        System.out.println("app context"+context);
    }
}