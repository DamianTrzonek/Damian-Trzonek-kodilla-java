package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    private Player getPlayer = new Player();
    private Computer computer = new Computer();
    private boolean end = false;
    private Scanner sc = new Scanner(System.in);
    private int numberOfWins;

    public void welcome() {
        System.out.println("Welcome to Rock, Paper, Scissors game!");
    }

    public void setName() {
        System.out.println("Please enter your name.");
        getPlayer.setName(sc.nextLine());
        while (getPlayer.getName() == null || getPlayer.getName().equals("")) {
            System.out.println("Please enter your name.");
            getPlayer.setName(sc.nextLine());
        }
        System.out.println("Hello " + getPlayer.getName());
    }

    public void setNumberOfWins() {
        System.out.println("Until how many wins would you like to play?");
        numberOfWins = sc.nextInt();
        while (numberOfWins <= 0) {
            System.out.println("You have to type a positive number. Try again.");
            numberOfWins = sc.nextInt();
        }
        System.out.println("Thanks. Your number of set wins is: " + numberOfWins);
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void rules() {
        System.out.println("GENERAL RULES: \n" + "1 - play rock \n" +
                "2 - play paper \n" +
                "3 - play scissors \n" +
                "x - finish game \n" +
                "n - new game");
    }

    public void startRound() {
        System.out.println(" <<<<< ROUND >>>>>");
        System.out.println("1 - play rock \n" +
                "2 - play paper \n" +
                "3 - play scissors");
        System.out.println("Please make your move.");
        getPlayer.playerMove();
        computer.computerMove();
        Validator.checkMoves(this);
    }

    public void endTheGame() {
        this.end = true;
    }

    public void gameEnds() {
        if(computer.getWins() == numberOfWins) {
            System.out.println(Computer.COMPUTER + " WON THE GAME!");
            endOrNewGameDecision();
        } else {
            System.out.println(getPlayer.getName() + " WON THE GAME!");
            endOrNewGameDecision();
            }
        }

    public void newGame() {
        welcome();
        rules();
        setName();
        setNumberOfWins();
        getPlayer.resetWins();
        computer.resetWins();
        while (!end) {
            startRound();
            Validator.checkWinner(this);
        }
        gameEnds();
    }

    public Player getPlayer() {
        return getPlayer;
    }

    public Computer getComputer() {
        return computer;
    }

    public void endOrNewGameDecision() {
        String endGameChoice = sc.nextLine();
        while(!endGameChoice.equals("n") && !endGameChoice.equals("x")) {
            System.out.println("x - finish game \n" +
                    "n - new game");
            System.out.println("Please enter your choice.");
            endGameChoice = sc.nextLine();
        }
        if(endGameChoice.equals("n")) {
            System.out.println("Are you sure you want to start new game? Press 'n' again to confirm");
            endGameChoice = sc.nextLine();
            if(endGameChoice.equals("n")) {
                newGame();
            } else {
                gameEnds();
            }
        } else if(endGameChoice.equals("x")) {
            System.out.println("Are you sure you want to exit the game? Press 'x' again to exit game.");
            endGameChoice = sc.nextLine();
            if(endGameChoice.equals("x")) {
                System.exit(0);
            } else {
                gameEnds();
            }
        }
    }

    public void printScore() {
        System.out.println(getPlayer().getName() + " " + getPlayer().getWins() + " - " + Computer.COMPUTER + " " + getComputer().getWins());
    }
}