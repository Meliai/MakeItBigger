package com.example;

import java.util.Random;

public class JokeLib {

    private Random rnd = new Random();

    public String getJoke(){
        String jokeStr;
        switch (rnd.nextInt(3)) {
            case 0:
                jokeStr = "Joke";
                break;
            case 1:
                jokeStr = "Joke Joke";
                break;
            default:
                jokeStr = "AHHA HAH AH";
                break;
        }
        return jokeStr;
    }
}
