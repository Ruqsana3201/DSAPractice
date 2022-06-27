package lex.computationalproblemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _19_AmicableNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<Integer> details = Arrays.stream(inputString.split(",")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(checkAmicable(details.get(0), details.get(1)));
        in.close();
    }

    private static boolean checkAmicable(Integer num1, Integer num2) {
        int sum = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                sum += i;
            }
            if (sum == num2) {
                sum = 0;
                for (int j = 1; j < num2; j++) {
                    if (num2 % j == 0) {
                        sum += j;
                    }
                }
                if (sum == num1)
                    return true;
            }
        }
        return false;
    }
}
