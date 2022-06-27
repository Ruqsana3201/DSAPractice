package lex.computationalproblemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _15_LeftSideTrianglePattern {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<Integer> details = Arrays.stream(inputString.split(",")).map(Integer::parseInt).collect(Collectors.toList());
        createLeftSideTriangle(details.get(0));
        in.close();
    }

    private static void createLeftSideTriangle(Integer rows) {
        int i, j, k;

        for (i = 0; i < rows; i++) {
            for (k = (rows - i - 1); k > 0; k--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
