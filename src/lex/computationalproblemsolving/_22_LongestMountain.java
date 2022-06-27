package lex.computationalproblemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class _22_LongestMountain {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        int[] heights = Arrays.stream(inputString.split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(findLongestMountain(heights));
    }

    private static int findLongestMountain(int[] ch) {
        int res = 0;
        int n = ch.length;
        Boolean flag = false;
        for (int i = 1; i < n; i++) {
            int count = 1;
            int j = i;
            //increasing sequence
            while (j < n && ch[j] > ch[j - 1]) {
                j++;
                count++;
            }
            //decreasing sequence
            while (i != j && j < n && ch[j] < ch[j - 1]) {
                j++;
                count++;
                flag = true;
            }

            if (i != j && flag && count > 2) {
                res = Math.max(res, count);
            }

        }
        return res;
    }

}
