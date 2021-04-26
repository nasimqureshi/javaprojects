package com.company;

import java.util.Scanner;


public class whileloop {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.println("Enter you name");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+ name);
    }
}
