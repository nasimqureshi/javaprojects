package com.company;

public class varargs {
    static int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        System.out.println("Welcome to varargs");
        System.out.println("The sum of 4 and5 is: " +sum(4, 5));
    }
}
