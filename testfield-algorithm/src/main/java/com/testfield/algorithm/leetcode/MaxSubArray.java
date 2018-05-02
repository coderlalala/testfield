package com.testfield.algorithm.leetcode;

public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        int maxSum = nums[0];
        int loopSum = 0;
        for (int i = 0; i < len; i++) {
            if (loopSum > 0) {
                loopSum += nums[i];
            } else {
                loopSum = nums[i];
            }
            if (loopSum > maxSum) {
                maxSum = loopSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] num1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(num1));

        int[] num2 = { -2, -1 };
        System.out.println(maxSubArray(num2));
    }
}
