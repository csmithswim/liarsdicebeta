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

        //Welcome message
        Console.welcome();

        while (play) {
            if (player1.getDice().isEmpty() || player2.getDice().isEmpty()) {play = false;}

                //Instantiating random object
                Random rand = new Random();

                //Filling myHand object with random die
                player1.roll(rand);
                player2.roll(rand);

                //Displaying first hand
                player1.displayCup(Console.displayCup());
                player1.setBet(Console.getBet());
                player1.checkBet(player2.getBet(), player2.getDice(), Console.getComparison());

                //Clears screen before next player's turn
//                Console.clearScreen();

                player2.displayCup(Console.displayCup());
                player2.setBet(Console.getBet());
                player2.checkBet(player1.getBet(), player1.getDice(), Console.getComparison());
        }
    }
}


    /*Each player must increase the quantity of the same face or any quantity of a different face

player 1 rolls their dice and its displayed to console
player 1 chooses which set, i.e. 3 2's, this can be input as integers

console is cleared

player 2 rolls their dice and its displayed to console
player 2 decides to call their opponent's bluff or to raise their die, i.e. 4 2's or 2 3's.
if player 2 calls their opponent's bluff, use a method that compares the scanner input of the player with the player's actual cup

* Play ends when a player loses all their dice
* */

//refactor turns into one turn, try to get final turn in the low.




    /*
        When 'checkBet' method is called compare player bet with their hand
        If their hand does not include their bet, subtract one die from player 1
        If their hand does include that list, subtract one die from player 2
        */

