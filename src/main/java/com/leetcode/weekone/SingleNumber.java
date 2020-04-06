package com.leetcode.weekone;

import java.util.Arrays;

/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i = i + 2) {
            if ((i + 1) == nums.length || nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        SingleNumber s = new SingleNumber();
        int[] numbers = new int[]{4, 1, 2, 1, 2};
        int singleNumber = s.singleNumber(numbers);
        System.out.println(singleNumber);
    }
}
