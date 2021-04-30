package com.company;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> food;
        food = new ArrayList<>();

        food.add("Pizza");
        food.add("Chicken Sandwich");
        food.add("Soda");
        food.add("French Fries");

        for (String s : food) {
            System.out.println(s);
        }
    }
}
