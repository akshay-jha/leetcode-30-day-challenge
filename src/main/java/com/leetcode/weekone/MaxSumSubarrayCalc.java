package com.leetcode.weekone;

/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

public class MaxSumSubarrayCalc {

    public int maxSubArrayMid(int[] nums, int low, int mid, int high) {
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;

        for (int i = mid; i >= low; i--) {
            sum += nums[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }

        sum = 0;
        int rightSum = Integer.MIN_VALUE;

        for (int i = mid + 1; i <= high; i++) {
            sum += nums[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }

        return leftSum + rightSum;
    }

    public int maxSubArraySum(int[] nums, int l, int h) {
        if (l == h) {
            return nums[l];
        }

        int m = (l + h) / 2;
        return Math.max(Math.max(maxSubArraySum(nums, l, m),
                maxSubArraySum(nums, m + 1, h)),
                maxSubArrayMid(nums, l, m, h));
    }

    public static void main(String[] args) {
        MaxSumSubarrayCalc maxSumSubarrayCalc = new MaxSumSubarrayCalc();
        int[] numbers = new int[]{1, 2, -1, -2, 3, 4};
        int maxSum = maxSumSubarrayCalc.maxSubArraySum(numbers, 0, numbers.length - 1);
        System.out.println("Max sum in the subarray is: " + maxSum);
    }
}
