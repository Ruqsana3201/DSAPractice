package lex.computationalproblemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _10_CoinChange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<Integer> details = Arrays.stream(inputString.split(",")).map(Integer::parseInt).collect(Collectors.toList());
        findCoinChange(details.get(0), details.get(1), details.get(2));
        in.close();
    }

    private static void findCoinChange(Integer numOf5, Integer numOf1, Integer amount) {
        int no5 = amount / numOf5;
        if (no5 >= numOf5)
            no5 = numOf5;
        int no1 = amount - (no5 * 5);
        if (no1 > numOf1)
            System.out.println("NP");
        else
            System.out.println("Minimum Number of 5 & 1 required to sum upto: " + amount +
                    " are " + no5 + "," + no1 + " respectively");
    }


}
