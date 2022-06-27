package lex.computationalproblemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _13_GCD {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<Integer> details = Arrays.stream(inputString.split(",")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println("GCD of numbers " + details.get(0) + " and " + details.get(1) + " is : " + findGCD(details.get(0), details.get(1)));
        in.close();
    }

    private static int findGCD(Integer num1, Integer num2) {
        int gcd = 0;
        for (int i = 1; i <= num1 & i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }
        return gcd;
    }

}
