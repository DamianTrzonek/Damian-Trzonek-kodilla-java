package com.kodilla.rps;

public class Validator {

    public static void checkMoves(Game game) {
        if(game.getPlayer().getPlayerMove().equals(new Rock()) && game.getComputer().getComputerMove().equals(new Rock())) {
            System.out.println("DRAW!");
           game.printScore();
        } else if(game.getPlayer().getPlayerMove().equals(new Rock()) && game.getComputer().getComputerMove().equals(new Paper())) {
            System.out.println(Computer.COMPUTER + " WINS!");
            game.getComputer().computerWinsRound();
            game.printScore();
        } else if(game.getPlayer().getPlayerMove().equals(new Rock()) && game.getComputer().getComputerMove().equals(new Scissors())) {
            System.out.println(game.getPlayer().getName() + " WINS!");
            game.getPlayer().playerWinsRound();
            game.printScore();
        } else if(game.getPlayer().getPlayerMove().equals(new Paper()) && game.getComputer().getComputerMove().equals(new Rock())) {
            System.out.println(game.getPlayer().getName() + " WINS!");
            game.getPlayer().playerWinsRound();
            game.printScore();
        } else if(game.getPlayer().getPlayerMove().equals(new Paper()) && game.getComputer().getComputerMove().equals(new Paper())) {
            System.out.println("DRAW!");
            game.printScore();
        } else if(game.getPlayer().getPlayerMove().equals(new Paper()) && game.getComputer().getComputerMove().equals(new Scissors())) {
            System.out.println(Computer.COMPUTER + " WINS!");
            game.getComputer().computerWinsRound();
            game.printScore();
        } else if(game.getPlayer().getPlayerMove().equals(new Scissors()) && game.getComputer().getComputerMove().equals(new Rock())) {
            System.out.println(Computer.COMPUTER + " WINS!");
            game.getComputer().computerWinsRound();
            game.printScore();
        } else if(game.getPlayer().getPlayerMove().equals(new Scissors()) && game.getComputer().getComputerMove().equals(new Paper())) {
            System.out.println(game.getPlayer().getName() + " WINS!");
            game.getPlayer().playerWinsRound();
            game.printScore();
        } else if(game.getPlayer().getPlayerMove().equals(new Scissors()) && game.getComputer().getComputerMove().equals(new Scissors())) {
            System.out.println("DRAW!");
            game.printScore();
        } else {
            System.out.println("Invalid input. Try again.");
    }
    }

    public static void checkWinner(Game game) {
        if(game.getComputer().getWins() == game.getNumberOfWins() || game.getPlayer().getWins() == game.getNumberOfWins()) {
            game.endTheGame();
        }
    }

}