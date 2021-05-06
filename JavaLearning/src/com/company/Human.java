package com.company;


public class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){

        this.name = name;
        this.age = age;
        this.weight = weight;

    }
    void eat(){
        System.out.println(this.name + "is eating his dinner");
    }
    void dirk(){
        System.out.println(this.name + "is drinking soda");
    }
}
