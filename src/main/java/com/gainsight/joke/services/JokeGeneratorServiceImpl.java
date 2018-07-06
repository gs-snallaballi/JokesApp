package com.gainsight.joke.services;

import com.gainsight.joke.dao.JokesModel;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Saiteja on 7/5/18
 */
@Service
public class JokeGeneratorServiceImpl implements JokeGeneratorService {

    @Autowired
    private JokesModel jokesModel;

    @Override
    public String returnJoke() {
        jokesModel.setJoke(new ChuckNorrisQuotes().getRandomQuote());
        return jokesModel.getJoke();
    }

}
