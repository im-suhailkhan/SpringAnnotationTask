package com.stackroute;

import org.springframework.stereotype.Component;

@Component("movie")
public class Movie {

    private Actor actor;

    public Movie(){
        System.out.println("movie object created");
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }
}