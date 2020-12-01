package com.csmithswim;

import java.util.*;

public class Cup {
    //Empty list to store first roll
    private List<Die> dice = new ArrayList<>();

    //Empty list to store bet throughout game
    private List<Integer> bet = new ArrayList<>();

    //Empty integer list to store dice


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

    public void checkBet(List<Integer> bet, List<Die> dice){
        //Converts Dice list to a list of integers
        List<Integer> diceToInteger = new ArrayList<>();
        for (var die : dice){
            diceToInteger.add(die.getValue());
        }

        //Sorting the list of integers
        Collections.sort(diceToInteger);

        int counter = 0;
        for (var die : diceToInteger){
            for (var i : bet){
                if (diceToInteger.indexOf(i) == -1){
                    counter++;
                    break;
                }
            }
        }

        if (counter != 0){
            subtractDice();
        }

        System.out.println(counter);
        System.out.println(diceToInteger);
        System.out.println(bet);
        System.out.println(dice);



//        if (dieToInteger.containsAll(bet)){
//            subtractDice();
//        }

        //just checks one at a time, sorting the dice
        //Using hash map



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

