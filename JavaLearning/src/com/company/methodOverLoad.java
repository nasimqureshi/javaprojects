package com.company;

public class methodOverLoad {
    public static void main(String[] args) {

        int x = add(1,2, 23, 66);
        System.out.println(x);
    }

    static int add(int a, int b) {
        System.out.println("Overloaded method 1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("Overloaded Method 2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("Over Loaded Method 3");
        return a + b + c + d;
    }
}