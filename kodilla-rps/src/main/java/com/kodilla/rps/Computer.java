package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {
    public static final String COMPUTER = "COMPUTER";
    private int wins = 0;

    public String normalPlay() {
        List<String> rpsNormalPlay = new ArrayList<>();
        rpsNormalPlay.add("ROCK");
        rpsNormalPlay.add("PAPER");
        rpsNormalPlay.add("SCISSORS");
        Random random = new Random();
        String computerPlay = rpsNormalPlay.get(random.nextInt(2));
        System.out.println(COMPUTER + "played" + computerPlay);
        return computerPlay;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
