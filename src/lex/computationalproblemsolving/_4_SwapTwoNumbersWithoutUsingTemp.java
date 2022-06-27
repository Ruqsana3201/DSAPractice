package lex.computationalproblemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _4_SwapTwoNumbersWithoutUsingTemp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<Integer> details = Arrays.stream(inputString.split(",")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println("Before Swapping : " + details.get(0) + " " + details.get(1));
        swapTwoNumbersWithoutUsingTemp(details.get(0), details.get(1));
        in.close();
    }

    private static void swapTwoNumbersWithoutUsingTemp(int n1, int n2) {
        n1 = n1 ^ n2;
        n2 = n1 ^ n2;
        n1 = n1 ^ n2;
        System.out.println("After Swapping : " + n1 + " " + n2);
    }

}
