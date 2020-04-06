package com.leetcode.weekone;

/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */

public class ZeroShifter {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count = count + 1;
            }
        }

        while (count < nums.length) {
            nums[count] = 0;
            count = count + 1;
        }
    }

    public static void main(String[] args) {
        int numbers[] = new int[]{0, 1, 0, 3, 2};

        ZeroShifter zeroShifter = new ZeroShifter();
        zeroShifter.moveZeroes(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
