package com.ds;

import java.util.Scanner;

public class AdvancedPatterns {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        printPattern(rows);
    }

    private static void printPattern(int rows) {

        //Butterfly Pattern
        //Upper half
       /* for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        //Lower half
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }*/

        //Solid Rhombus
        /*for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= rows; j++)
                System.out.print("*");
            System.out.println();
        }*/

        //Number Pyramid
        /*for (int i = 1; i <= rows; i++) {
            //spaces
            for (int j = 1; j <= rows - i; j++)
                System.out.print(" ");
            //numbers
            for (int j = 1; j <= i; j++)
                System.out.print(i + " ");
            System.out.println();
        }*/

        //Palindromic Pattern
        /*for (int i = 1; i <= rows; i++) {
            //spaces
            for (int j = 1; j <= rows - i; j++)
                System.out.print(" ");

            //1st half numbers
            for (int j = i; j >= 1; j--)
                System.out.print(j);

            //2nd half numbers
            for (int j = 2; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }*/

        for (int i = 1; i <= rows; i++) {
            //spaces
            for (int j = 1; j <= rows - i; j++)
                System.out.print(" ");
            //Upper half
            for (int j = 1; j <= (2 * i) - 1; j++)
                System.out.print("*");
            System.out.println(" ");
        }
        for (int i = rows; i > 0; i--) {
            //spaces
            for (int j = 1; j <= rows - i; j++)
                System.out.print(" ");
            //Lower half
            for (int j = 1; j <= (2 * i) - 1; j++)
                System.out.print("*");
            System.out.println(" ");
        }
    }
}
