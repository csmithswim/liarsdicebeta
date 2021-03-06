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

    static public String displayCup(){
        System.out.println("Enter 'show' to display cup.");
        String choice = scanner.nextLine();
        return choice;
    }

    static public String getComparison(){
        System.out.println("Enter 'bull' to compare opponent's claim and opponent's cup, if not just hit enter.");
        String choice = scanner.nextLine();
        return choice;
    }

    static public void clearScreen(){
        for (int j = 0; j < 25; j++) {
            System.out.println("\n");
        }
    }

    static public List<Integer> askClaim() {
        System.out.println("Enter the die you are claiming you have, i.e. 222 to enter 3 2's. If you are not claiming any and want to call your opponent's bluff enter 9.");
        List<Integer> choices = new ArrayList<>();
        String choice = scanner.nextLine();
        String splitChoice[] = choice.split("");

        for (var i : splitChoice) {
            int userInput = Integer.parseInt(i);
            choices.add(userInput);
        }
        return choices;
    }

}


