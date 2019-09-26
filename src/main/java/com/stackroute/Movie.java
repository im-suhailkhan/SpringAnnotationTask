package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("movie")
public class Movie {

    @Autowired
    private Actor actor;

   /* public Movie(Actor actor) {
        this.actor = actor;
    }*/

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }
}