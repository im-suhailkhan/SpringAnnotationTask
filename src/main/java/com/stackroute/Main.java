package com.stackroute;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String [] args){
        ApplicationContext context= new AnnotationConfigApplicationContext(config.class);
        //BeanFactory factory= new XmlBeanFactory(new ClassPathResource("beans.xml"));

        Movie movie=context.getBean(Movie.class);
       // Actor actor= context.getBean("actor",Actor.class);


       /* Movie beanA=context.getBean(Movie.class);
        Movie beanB=context.getBean(Movie.class);*/
       // Actor actor= context.getBean("actor",Actor.class);

        //Actor actor1= factory.getBean("actor",Actor.class);

        System.out.println("using appcontext " + movie.getActor().getGender());
        System.out.println("using appcontext " + movie.getActor().getAge());
        System.out.println("using appcontext " + movie.getActor().getName());

      /*  if(beanA == beanB)
            System.out.println("beanA is equal to beanB ");
        else
            System.out.println("bean A is not equal to bean B");*/



       /* System.out.println("using beanFactory " + actor1.getGender());
        System.out.println("using beanFactory " + actor1.getName());
        System.out.println("using beanFactory " + actor1.getAge());*/

    }


}