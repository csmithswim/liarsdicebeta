package com.csmithswim;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Instantiating random object
        Random rand = new Random();
        //Instantiating hand object
        Cup myCup1 = new Cup(7);
        Cup myCup2 = new Cup(7);

        System.out.println(myCup1);
    }
}
