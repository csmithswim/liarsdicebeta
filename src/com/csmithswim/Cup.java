package com.csmithswim;

import java.util.*;

public class Cup {
    //Empty list to store first roll
    private List<Die> dice = new ArrayList<>();

    //Empty list to store bet throughout game
    private List<Integer> claim = new ArrayList<>();

    //Empty integer list to store dice


    //Hand constructor
    public Cup(int size) {
        for (int count = 0; count < size; count++) {
            dice.add(new Die());
        }
    }

    public List<Integer> claim(List<Integer> choices) {
        if(choices.get(0).equals(9)){
            System.out.println(" ");
        }
        for (int choice : choices) {
            claim.add(choice);
        }
        return claim;
    }

    public List<Die> getDice(){
        return dice;
    }

    public List<Integer> getClaim(){
        return claim;
    }


    public void checkClaim(List<Integer> bet, List<Die> dice, String choice){
        if (choice.equalsIgnoreCase("pass")){
            System.out.println(" ");
        }
        else if (choice.equalsIgnoreCase("bull")) {
            //Converts Dice list to a list of integers
            List<Integer> diceToInteger = new ArrayList<>();
            for (var die : dice) {
                diceToInteger.add(die.getValue());
            }
            //Sorting the list of integers
            Collections.sort(diceToInteger);
            Collections.sort(bet);
            int counter = 0;
            for (var die : diceToInteger) {
                for (var i : bet) {
                    if (diceToInteger.indexOf(i) != -1) {
                        counter++;
                    }
                }
            }

            if (counter != bet.size()) {
                System.out.println("test");
                dice.remove(0);
            }
        }
    }

    //Rolling all die
    public void roll(Random rand) {
        for (Die die : dice) {
            die.roll(rand);
        }
    }

    //Rolling one die
    public void roll(Random rand, int choice) {
        dice.get(choice).roll(rand);
    }

    //Rolling more than one die
    public void roll(Random rand, List<Integer> choices) {
        for (int choice : choices) {
            roll(rand, choice);
        }
    }

    public void displayCup(String choice){
        if (choice.equalsIgnoreCase("show")){
            String displayedDiced = "";
            for (var die : dice) {
                displayedDiced += die + " ";
            }
            System.out.println(displayedDiced.trim());
        }
    }

    //Printing die to screen
    @Override
    public String toString() {

        String output = "";
        for (var die : dice) {
            output += die.getValue() + " ";
        }
        return output.trim();
    }
}

