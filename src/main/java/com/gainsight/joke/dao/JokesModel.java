package com.gainsight.joke.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by Saiteja on 7/5/18
 */

@Repository
public class JokesModel {

    private String Joke;

    public String getJoke() {
        return Joke;
    }

    public void setJoke(String joke) {
        Joke = joke;
    }
}
