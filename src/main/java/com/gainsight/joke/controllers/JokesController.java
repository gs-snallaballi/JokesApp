package com.gainsight.joke.controllers;

import com.gainsight.joke.services.JokeGeneratorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Saiteja on 7/5/18
 */
@Controller
public class JokesController {

    private final JokeGeneratorService jokeGeneratorService;

    public JokesController(JokeGeneratorService jokeGeneratorService) {
        this.jokeGeneratorService = jokeGeneratorService;
    }

    @RequestMapping(value = {"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeGeneratorService.returnJoke());
        return "view";
    }

}
