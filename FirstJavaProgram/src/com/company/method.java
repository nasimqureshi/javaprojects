package com.company;

public class method {
    public static void main(String[] args){

        welcome();
        multiply(6, 9);
        multiply(66, 99);
        multiply(60, 92);
        multiply(16, 29);
    }
    public static void welcome(){
        System.out.println("calculator");
    }
    public static void multiply(int a, int b){
        System.out.println(a * b);
    }
}
