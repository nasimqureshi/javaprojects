package com.company;

public class arrays {
    public static void main(String[] args) {
        //   int [] marks = new int[5];
//        marks[0] = 100;
//        marks[1] = 60;
//        marks[2] = 70;
//        marks[3] = 90;
//        marks[4] = 86;
//
        int[] marks = {90, 70, 80, 71, 98};
//        System.out.println(marks[4]);
//        System.out.println(marks.length);

        //Displaying the Array (for loop)
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("Printing array in reverse order");
        for (int i=marks.length -1; i >= 0; i--) {
            System.out.println(marks[i]);
    }
        System.out.println("Printing the array using for-each loop");
        for(int element: marks){
            System.out.println(element);
        }
}
}