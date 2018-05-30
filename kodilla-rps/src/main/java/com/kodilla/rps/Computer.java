package com.kodilla.rps;

import java.util.Random;

public class Computer {

    public static final String COMPUTER = "COMPUTER";
    private int wins = 0;
    private Type computerMove;


    public void computerMove() {
        Random random = new Random();
        int computerChoosesNumber = random.nextInt(3) + 1;
        switch (computerChoosesNumber) {
            case 1:
                System.out.println(COMPUTER + " played ROCK");
                computerMove = new Rock();
                break;
            case 2:
                System.out.println(COMPUTER + " played PAPER");
                computerMove = new Paper();
                break;
            case 3:
                System.out.println(COMPUTER + " played SCISSORS");
                computerMove = new Scissors();
                break;
        }
    }

    public Type getComputerMove() {
        return computerMove;
    }


    public int getWins() {
        return wins;
    }

    public void computerWinsRound() {
        this.wins += 1;
    }

    public void resetWins() {
        this.wins = 0;
    }
}
