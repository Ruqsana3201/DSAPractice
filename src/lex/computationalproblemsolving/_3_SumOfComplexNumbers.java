package lex.computationalproblemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _3_SumOfComplexNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<Float> details = Arrays.stream(inputString.split(",")).map(Float::parseFloat).collect(Collectors.toList());
        calculateSumComplexNumbers(details.get(0), details.get(1), details.get(2), details.get(3));
        in.close();
    }

    private static void calculateSumComplexNumbers(Float realNumber1, Float imaginaryNumber1, Float realNumber2, Float imaginaryNumber2) {
        System.out.println(realNumber1 + realNumber2 + "+" + (imaginaryNumber1 + imaginaryNumber2) + "i");
    }
}
