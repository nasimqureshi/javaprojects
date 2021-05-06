package com.company;

public class constructors {
    public static void main(String[] args) {
      Human human1 = new Human("Nasim Qureshi", 68, 170);
      Human human2 = new Human("Qamar Qureshi", 65, 150);

        System.out.println(human1.name);
        System.out.println(human1.age);
        System.out.println(human1.weight);

        System.out.println(human2.name);
        System.out.println(human2.age);
        System.out.println(human2.weight);
    }

}
