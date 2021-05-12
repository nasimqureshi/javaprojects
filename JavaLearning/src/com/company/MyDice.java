package com.company;
import java.util.Random;


public class MyDice {

    Random random;
    int number;

    MyDice(){
        random = new Random();
        roll();

    }
    void roll(Random random, int number) {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
