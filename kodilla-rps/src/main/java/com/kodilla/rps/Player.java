package com.kodilla.rps;

import java.util.Scanner;

public class Player {
   private String name;
   private int wins = 0;
   private Type playerMove;

   public void playerMove() {
       Scanner scanner = new Scanner(System.in);
       String rpsChoice = scanner.nextLine();
       switch (rpsChoice) {
           case "1":
               System.out.println(getName() + " played ROCK");
               playerMove = new Rock();
               break;
           case "2":
               System.out.println(getName() + " played PAPER");
               playerMove = new Paper();
               break;
           case "3":
               System.out.println(getName() + " played SCISSORS");
               playerMove = new Scissors();
               break;
               default:
                   System.out.println("Not valid option! Choose from 1 to 3.");
       }
   }

    public Type getPlayerMove() {
        return playerMove;
    }

    public int getWins() {
        return wins;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void playerWinsRound() {
       this.wins += 1;
    }

    public void resetWins() {
        this.wins = 0;
    }
}

