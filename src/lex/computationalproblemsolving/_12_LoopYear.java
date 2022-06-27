package lex.computationalproblemsolving;

import java.util.Scanner;

public class _12_LoopYear {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        checkLeapYear(Integer.parseInt(inputString));
        in.close();
    }

    private static void checkLeapYear(int year) {
        if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a leap year");
    }
}
