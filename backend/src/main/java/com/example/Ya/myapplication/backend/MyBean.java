package com.example.Ya.myapplication.backend;

import com.example.JokeLib;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private JokeLib joke;

    public MyBean() {
        joke = new JokeLib();
    }

    public String getJoke() {
        return joke.getJoke();
    }
}