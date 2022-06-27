package lex.computationalproblemsolving;

import java.util.Scanner;

public class _20_MaximumPathSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        String[] details = inputString.split("#");
        int[][] arr = new int[details.length][details.length];
        for (int i = 0; i < details.length; i++) {
            String[] value = details[i].split(",");
            for (int j = 0; j < value.length; j++)
                arr[i][j] = Integer.parseInt(value[j]);
        }
        System.out.println(findMaximumPath(arr));
        in.close();
    }

    private static int findMaximumPath(int[][] arr) {
        int n = arr.length;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            int diagonalSum = 0;
            int x = 0;
            int y = i;
            for (int j = i; j < n; j++) {
                diagonalSum += arr[x][y];
                x += 1;
                y += 1;
                if (diagonalSum > maxSum)
                    maxSum = diagonalSum;
            }
        }

        for (int i = 1; i < n; i++) {
            int diagonalSum = 0;
            int x = i;
            int y = 0;
            for (int j = i; j < n; j++) {
                diagonalSum += arr[x][y];
                x += 1;
                y += 1;
                if (diagonalSum > maxSum)
                    maxSum = diagonalSum;
            }
        }
        return maxSum;

//        int maxSum = 0;
//        int n = arr.length;
//        for (int row = 0; row < n; row++) {
//            maxSum += arr[row][row];
//        }

    }
}
