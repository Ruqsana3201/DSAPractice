package lex.computationalproblemsolving;

import java.util.Scanner;

public class _21_ContiguousArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        char[] ch = inputString.toCharArray();
        System.out.println(findContiguousArray(ch));
    }

    private static int findContiguousArray(char[] ch) {
        int sumOfA = 0;
        int sumOfB = 0;
        int maxlen = 0;

        for (char c : ch) {
            if (c == 'a')
                sumOfA += 1;
            else if (c == 'b')
                sumOfB += 1;

            if (sumOfA == sumOfB)
                maxlen = sumOfA * 2;
        }
        return maxlen;
    }
}
