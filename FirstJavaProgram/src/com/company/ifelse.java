package com.company;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        int age;
        System.out.println("Enter your age :");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age > 56){
            System.out.println("Experienced");
        }
        else if(age > 46){
            System.out.println("sami-experienced");
        }
        else if(age > 36){
            System.out.println("sami-sami experienced");
        }
        else {
            System.out.println("not experienced");
        }
    }
}
