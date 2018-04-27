package com.kodilla.rps;


import java.util.Scanner;

public class Welcome {

    public void welcome() {
        System.out.println("Welcome to Rock, Paper, Scissors game!");
        System.out.println("Please enter your name.");
        Scanner sc = new Scanner(System.in);
        String playerName = sc.next();
        if (playerName == null) {
            System.out.println("Please enter your name.");
        }
        System.out.println("Hello " + playerName);
    }

    public void rules() {
        System.out.println("Here are the rules: ");
        System.out.println("1 - play rock");
        System.out.println("2 - play paper");
        System.out.println("3 - play scissors");
        System.out.println("x - finish game");
        System.out.println("n - new game");

    }

    }
