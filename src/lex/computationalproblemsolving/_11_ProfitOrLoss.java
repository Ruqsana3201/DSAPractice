package lex.computationalproblemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _11_ProfitOrLoss {

//    Character lowercase/uppercase
//    char ch = 'A';
//        if (Character.isLowerCase(ch))
//            System.out.println("Lowercase");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<Integer> details = Arrays.stream(inputString.split(",")).map(Integer::parseInt).collect(Collectors.toList());
        findProfitLoss(details.get(0), details.get(1));
        in.close();
    }

    private static void findProfitLoss(Integer costPrice, Integer sellingPrice) {
        if (costPrice > sellingPrice)
            System.out.println("Profit : " + (costPrice - sellingPrice));
        else
            System.out.println("Loss : " + (sellingPrice - costPrice));
    }
}
