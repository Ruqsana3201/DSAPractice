package lex.computationalproblemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _8_GreatestOf3Numbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<Integer> details = Arrays.stream(inputString.split(",")).map(Integer::parseInt).collect(Collectors.toList());
        findGreatestOf3Numbers(details.get(0), details.get(1), details.get(2));
        in.close();
    }

    private static void findGreatestOf3Numbers(Integer num1, Integer num2, Integer num3) {
        if (num1 > num2 && num1 > num3)
            System.out.println("Greatest of 3 numbers " + num1 + "," + num2 + "," + num3 + " is : " + num1);
        else if (num2 > num3)
            System.out.println("Greatest of 3 numbers " + num1 + "," + num2 + "," + num3 + " is : " + num2);
        else
            System.out.println("Greatest of 3 numbers " + num1 + "," + num2 + "," + num3 + " is : " + num3);

        //System.out.println((num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3); 2nd method

    }
}


