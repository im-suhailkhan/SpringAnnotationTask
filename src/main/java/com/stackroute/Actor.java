package com.stackroute;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("actor")
public class Actor {

    @Value("${actor.Name}")
    private String name;

    @Value("${actor.Gender}")
    private String gender;

    @Value("${actor.Age}")
    private int age;

   /* public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }*/

    public Actor() {
        System.out.println("actor object created");
    }


    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}