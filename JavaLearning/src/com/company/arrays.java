
package com.company;
public class arrays {
    public static void main(String[] args) {
 //       String[] cars = new String[3];
//        cars[0] = "Toyota";
//        cars[1] = "Nisan";
//        cars[2] = "Honda";
//
//        for(int i =0; i < cars.length; i++){
//            System.out.println(cars[i]);
//        }

        String[][] cars = new String[3][3];
        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";

        for(int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0; j<cars[i].length; i++){
                System.out.print(cars[i][j]+ "");
            }
        }

    }
}
