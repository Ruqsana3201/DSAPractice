package lex.computationalproblemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_PrintingAddress {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<String> address = Arrays.stream(inputString.split(","))
                .collect(Collectors.toList());
        System.out.println(address.get(0));
        System.out.println(address.get(1));
        System.out.println(address.get(2));
    }
}
