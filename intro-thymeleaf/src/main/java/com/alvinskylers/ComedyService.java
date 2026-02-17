package com.alvinskylers;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ComedyService {

    private String[] jokes = new String[10];

    public ComedyService() {
        populateJokes();
    }

    private void populateJokes() {
        jokes[0] = "Q: Did you hear about the mathematician who’s afraid of negative numbers? " +
                "\n\nA: He'll stop at nothing to avoid them.";
        jokes[1] = "Q: How many programmers does it take to change a light bulb?" +
                "\n\nA: none, that's a hardware problem";
        jokes[2] = "Q: Why did the programmer quit their job?" +
                "\n\nA: Because he didn't get arrays.";
    }

    protected String getRandomJoke() {
        Random r =  new Random();
        int i = r.nextInt(10);
        return jokes[i];
    }
}
