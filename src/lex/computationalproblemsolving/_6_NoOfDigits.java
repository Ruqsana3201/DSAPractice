package lex.computationalproblemsolving;

import java.util.Scanner;

public class _6_NoOfDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer inputString = in.nextInt();
        findNoOfDigits(145);
        in.close();
    }

    private static void findNoOfDigits(Integer inputString) {
        System.out.println("Number of digits in given number " + inputString + " is : " + String.valueOf(inputString).length());
        System.out.println((int) Math.floor(Math.log10(inputString) + 1));
    }
}
