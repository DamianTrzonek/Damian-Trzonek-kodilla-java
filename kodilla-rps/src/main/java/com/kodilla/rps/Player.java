package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public static final String PLAYER = "PLAYER";
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";
    private int wins = 0;

    public final String  play() {
        String play = null;
        if (number == 1) {
            play = ROCK;
        } else if (number == 2) {
             play = PAPER;
        } else if (number == 3) {
             play = SCISSORS;
        } else {
            System.out.println("You have to choose from numbers 1 to 3!");
        }
        return play;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
