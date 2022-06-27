package lex.computationalproblemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _5_MultiplyDivideBy2UsingBitwise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<Integer> details = Arrays.stream(inputString.split(",")).map(Integer::parseInt).collect(Collectors.toList());
        multiplyDivideBy2UsingBitwise(details.get(0));
        in.close();
    }

    private static void multiplyDivideBy2UsingBitwise(Integer number1) {
        System.out.println("Left Shift(Multiplication) of " + number1 + " is : " + (number1 << 1));
        System.out.println("Right Shift(Division) of " + number1 + " is : " + (number1 >> 1));
    }

}
