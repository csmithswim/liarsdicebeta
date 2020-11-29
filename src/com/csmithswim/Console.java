package com.csmithswim;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    static public void welcome(){
        System.out.println("Welcome To Career Dev's Liar's Dice.");}

    //Display and creates scanner object to take one number
    static public int getChoice(){
        System.out.println("Pick a die 1-7 to re-roll: ");
        int choice = scanner.nextInt();
        return choice - 1;
    }
    //Always do logic, then validation and then sanitization
    static public List<Integer> getChoices(){
        System.out.println("Pick any die 1-7 to re-roll: ");
        String choice = scanner.nextLine();
        String splitChoice[] = choice.split("");
        List<Integer> choices = new ArrayList<>();
        for (var i : splitChoice) {
            int userInput = Integer.parseInt(i)-1;
            choices.add(userInput);
        }
        return choices;
    }

    static public void clearScreen(){
        for (int j = 0; j < 50; j++) {
            System.out.println("\n");
        }
    }

    static public List<Integer> getBet() {
        System.out.println("Enter the die you are claiming you have, i.e. 222 to enter 3 2's. Enter 'bull' if you think your opponent is lying.");
        List<Integer> choices = new ArrayList<>();
        String choice = scanner.nextLine();
        String splitChoice[] = choice.split("");

        for (var i : splitChoice) {
            int userInput = Integer.parseInt(i);
            choices.add(userInput);
        }
        return choices;
    }

    static public List<Integer> callBet() {
        System.out.println("Enter '1' to check bet of opposing player's bet. Otherwise enter '2' to set your own bet.");
        int choice = scanner.nextInt();
        List<Integer> bet = new ArrayList<>();
        if (choice == 1) {
            bet.add(1);
            return bet;
        } else if (choice == 2) {
            return getBet();
        } else return bet;
    }
}


