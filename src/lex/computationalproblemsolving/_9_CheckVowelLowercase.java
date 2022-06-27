package lex.computationalproblemsolving;

import java.util.Scanner;

public class _9_CheckVowelLowercase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();
        checkVowels(inputString);
        in.close();
    }

    private static void checkVowels(String inputString) {
        if (inputString.equals("a") || inputString.equals("e") || inputString.equals("i") ||
                inputString.equals("o") || inputString.equals("u"))
            System.out.println("Character " + inputString + " is a vowel");
        else
            System.out.println("Character " + inputString + " is not a vowel");

    }
}
