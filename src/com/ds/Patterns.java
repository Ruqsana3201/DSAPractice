package com.ds;

import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        createPattern(rows, columns);
    }

    private static void createPattern(int rows, int columns) {
        //Solid Rectangle
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < rows; j++)
//                System.out.print("*");
//            System.out.println();
//        }

        //Hollow Rectangle
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= columns; j++)
//                if (i == 1 || i == rows || j == 1 || j == columns)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            System.out.println();

        //Right angled triangle
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++)
//                System.out.print("*");
//            System.out.println();
//        }

        //Inverted Right Pyramid
//        for (int i = 0; i < rows; i++) {
//            for (int j = rows-i; j > 0; j--)
//                System.out.print("*");
//            System.out.println();
//        }

        //Mirrored Right Pyramid
//        for (int i = 1; i <= rows; i++) {
//            for (int k = rows - i; k > 0; k--)
//                System.out.print(" ");
//            for (int j = i; j > 0; j--)
//                System.out.print("*");
//            System.out.println();
//        }

        //Half Pyramid with numbers
//        for (int i = 0; i <= rows; i++) {
//            for (int j = 1; j <= i; j++)
//                System.out.print(j);
//            System.out.println();
//        }

        //Inverted Half Pyramid with numbers
//        for (int i = 0; i <= rows; i++) {
//            for (int j = 1; j <= rows - i; j++)
//                System.out.print(j + " ");
//            System.out.println();
//        }

        //Floyd's Triangle
//        int counter = 1;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++)
//                System.out.print(counter++ + " ");
//            System.out.println();
//        }

        //0-1 Triangle
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++)
                if ((i + j) % 2 == 0)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
            System.out.println();
        }

    }
}