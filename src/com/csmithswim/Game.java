package com.csmithswim;
import java.util.Random;
import java.util.Scanner;

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
public class Game {
    boolean play;

    public Game(boolean play) {
        this.play = true;
    }

    public void start() {

        while (play) {

        //Instantiating random object
        Random rand = new Random();

        //Instantiating both players
        Cup player1 = new Cup(7);
        Cup player2 = new Cup(7);

        //Filling myHand object with random die
        player1.roll(rand);
        player2.roll(rand);

        Console.welcome();

        //Displaying first hand
        System.out.println(player1);
        player1.setBet(Console.getBet());


        //Clears screen before next player's turn
        Console.clearScreen();

        System.out.println(player2);
        player2.setBet(Console.getBet());

        System.out.println(player1.getBet());
        System.out.println(player2.getBet());


//        Console.clearScreen();

        play=false;

        }
    }
}


