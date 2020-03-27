package com.durgaSoftwareUdemy;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Functionality fun = new Functionality();
        fun.numberGenerator();
    }
}

class Functionality {
    public void numberGenerator() {
        int genNum, guess;
        Scanner scr = new Scanner(System.in);
        Random rand = new Random();
        genNum = rand.nextInt(100) + 1;
        int count = 1;
        do {
            System.out.println(" Guess the number between 0 to 100 ");
            guess = scr.nextInt();
            if (guess == genNum) {
                System.out.println(" Congratulations you Win !! after " + count + " tries ");
            } else if (guess < genNum) {

                System.out.println(" Your guess number " + guess + " is lower than Secret number \n you had tried " + count + " times ");
                count++;

            } else if (guess > genNum) {

                System.out.println(" Your guess number " + guess + " is higher than Secret number \n you had tried " + count + " times ");
                count++;
            }
        }
        while (guess != genNum);
    }
}



