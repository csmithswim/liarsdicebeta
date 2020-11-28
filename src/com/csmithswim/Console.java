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

    static public void bet(){
        System.out.println("Enter the die you have, i.e. 222 to enter 3 2's.");
        String choice = scanner.nextLine();
        String splitChoice[] = choice.split("");
        List<Integer> choices = new ArrayList<>();
        for (var i : splitChoice) {
            int userInput = Integer.parseInt(i)-1;
            choices.add(userInput);
        }



    }

}


