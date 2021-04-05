package com.company;


        public class args {
            static int sum(int a, int b) {
                return a + b;
            }
            static int sum(int a, int b, int c) {
                return a + b + c;
            }
            static int sum(int a, int b, int c, int d) {
                return a + b + c + d;
            }

            public static void main(String[] args) {
                System.out.println("Welcome to Args");
                System.out.println("The sum of 9 and 6 is: " + sum(9, 6));
                System.out.println("The sum of 9 and 6 is: " + sum(9, 6, 10));
                System.out.println("The sum of 9 and 6 is: " + sum(9, 6, 10, 12));
            }

        }



