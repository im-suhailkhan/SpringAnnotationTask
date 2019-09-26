package com.stackroute;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.stackroute")
@PropertySource("classpath:info.properties")
public class config {

    @Bean
    public BeanLifecycleDemoBean lifeBean(){
        BeanLifecycleDemoBean beanLifecycleDemoBean= new BeanLifecycleDemoBean();
        return beanLifecycleDemoBean;
    }

    /*@Bean

    public Actor actorBean(){
        Actor actor=new Actor("suti","male",23);
        return actor;

    }

    @Bean
    @Scope("prototype")
    public Movie movieBean(){

        Movie movie= new Movie(actorBean());
        return movie;
    }*/



}
