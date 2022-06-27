package lex.computationalproblemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_PrintDetails {

    public static void printDetails(String name, String mobile, String address, int items, float billAmount) {
        System.out.println("Name : " + name);
        System.out.println("Mobile : " + mobile);
        System.out.println("Address : " + address);
        System.out.println("Items : " + items);
        System.out.println("BillAmount : $ " + billAmount * items);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<String> details = Arrays.stream(inputString.split(",")).collect(Collectors.toList());
        printDetails(details.get(0), details.get(1), details.get(2), Integer.parseInt(details.get(3)), Float.parseFloat(details.get(4)));
        in.close();
    }


}
