package com.ds;

public class NonRepeatingElementInArrayUsingXOR {

    //Find the only non repeating element in ana array where every element repeats twice
    //Time complexity O(n) Space Complexity O(1)
//    int[] arr = {5, 4, 1, 4, 3, 5, 1};
   /* public static int findNonRepeatingElement(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
*/


    //Find two non repeating element in ana array where every element repeats twice
//    int[] arr = {5, 4, 1, 4, 3, 5, 1, 2};
//    Time complexity O(n) Space Complexity O(1)
    /*public static void findNonRepeatingElement(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        int temp = res;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                res = res ^ arr[i];
            } else {
                temp = temp ^ arr[i];
            }

        }
        System.out.println(res);
        System.out.println(temp);
    }
*/

    //Find two non repeating element in ana array where every element repeats thrice
//    int[] arr = {2, 2, 1, 5, 1, 1, 2};
//    Time complexity O(n) Space Complexity O(1)
    public static void findNonRepeatingElement(int[] arr) {

    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 5, 1, 1, 2};
        findNonRepeatingElement(arr);
    }
}
