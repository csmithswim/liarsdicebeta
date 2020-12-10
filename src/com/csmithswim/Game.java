package com.csmithswim;
import java.util.Random;
import java.util.Scanner;

public class Game {
    boolean play;

    public Game(boolean play) {
        this.play = true;
    }

    public void start() {

        //Instantiating both players
        Cup player1 = new Cup(7);
        Cup player2 = new Cup(7);

        //Round field to keep track of rounds
        int round = 1;

        //Welcome message
        Console.welcome();

        while (play) {
            System.out.println("Round "+ round);
                //Instantiating random object
                Random rand = new Random();

                //Filling myHand object with random die
                player1.roll(rand);
                player2.roll(rand);

                //Displaying first hand
                System.out.println("\nPlayer 1's turn. Player 2 please look away from screen.");
                player1.displayCup(Console.displayCup());
                System.out.println("Number of dice in Player 1's cup: " + player1.getDice().size() + "\n");
                player1.claim(Console.askClaim());
                player1.checkClaim(player2.getClaim(), player2.getDice(), Console.getComparison());
                    if (player1.getDice().isEmpty() || player2.getDice().isEmpty()) {play = false;}


                //Clears screen before next player's turn
                Console.clearScreen();

                System.out.println("Player 2's turn. Player 1 please look away from screen.");
                player2.displayCup(Console.displayCup());
                System.out.println("Number of dice in Player 2's cup: " + player2.getDice().size() + "\n");
                player2.claim(Console.askClaim());
                player2.checkClaim(player1.getClaim(), player1.getDice(), Console.getComparison());
                    if (player1.getDice().size() ==2 || player2.getDice().size()==2) {play = false;}

            round++;
        }
    }
}

