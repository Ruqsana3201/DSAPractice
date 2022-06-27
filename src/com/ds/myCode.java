package com.ds;

import java.util.Scanner;

class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int ans = 0;
        while (t-- > 0) {
            int n = in.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                long res1 = arr[0] + 2 * arr[1] + arr[n - 1];
                long res2 = 2 * arr[0] + arr[n - 1] + arr[n - 2];
                ans += Math.min(res1, res2);
                n -= 2;
            }
            if (n == 3) {
                ans += (arr[0] + arr[1] + arr[2]);
            } else if (n == 2) {
                ans += arr[1];
            } else {
                ans += arr[0];
            }
            System.out.println(ans);
        }
    }
}