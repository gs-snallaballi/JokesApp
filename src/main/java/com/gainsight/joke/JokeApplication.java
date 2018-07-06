package com.gainsight.joke;

import com.gainsight.joke.controllers.JokesController;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JokeApplication {

    public static void main(String[] args) {

        SpringApplication.run(JokeApplication.class, args);
    }
}
