package com.csmithswim;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cup {
    //Empty list to store first roll
    private List<Die> dice = new ArrayList<>();

    //Empty list to store bet throughout game
    private List<Integer> bet = new ArrayList<>();


    //Hand constructor
    public Cup(int size) {
        for (int count = 0; count < size; count++) {
            dice.add(new Die());
        }
    }

    public List<Integer> setBet(List<Integer> choices) {
        for (int choice : choices) {
            bet.add(choice);
        }
        return bet;
    }

    public List<Die> getDice(){
        return dice;
    }

    public List<Integer> getBet(){
        return bet;
    }


    public List<Die> subtractDice(){
        dice.remove(0);

    return dice;

    }

    public void checkBet(List<Integer> bet, List<Die> cup){
            System.out.println(bet);
            System.out.println(cup);
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

