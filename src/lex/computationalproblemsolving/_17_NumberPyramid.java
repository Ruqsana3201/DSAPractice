package lex.computationalproblemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


//UNABLE TO SOLVE
public class _17_NumberPyramid {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<Integer> details = Arrays.stream(inputString.split(",")).map(Integer::parseInt).collect(Collectors.toList());
        createNumberPyramid(details.get(0));
        in.close();
    }

    private static void createNumberPyramid(Integer rows) {
        int i, j, k;

        for (i = 1; i <= rows; i++) {
            for (k = (rows - i); k > 0; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + j - 1);
            }
            for (j = i - 1; j >= 1; j--) {
                System.out.print(j +1);
            }
            System.out.println();

        }
    }
}
