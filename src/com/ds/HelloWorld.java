package com.ds;

class HelloWorld {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int j = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i] + nums[j];
            if (sum == target)
                System.out.println(i + j);
            else {
                sum=0;
                j--;
            }
        }
    }
}
