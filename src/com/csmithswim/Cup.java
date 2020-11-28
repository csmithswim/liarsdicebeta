package com.csmithswim;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cup {
    //Empty list to store first roll
    private List<Die> dice = new ArrayList<>();

    //Empty list to store bet throughout game
    private List<Die> bet = new ArrayList<>();


    //Hand constructor
    public Cup(int size) {
        for (int count = 0; count < size; count++) {
            dice.add(new Die());
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

